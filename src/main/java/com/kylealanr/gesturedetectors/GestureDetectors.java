package com.kylealanr.gesturedetectors;

import android.view.MotionEvent;

@SuppressWarnings("unused")
public class GestureDetectors {
    public static class OnDown extends GestureListener {
        private final $Predicate<MotionEvent> predicate;

        public OnDown($Predicate<MotionEvent> predicate) {
            this.predicate = predicate;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return predicate != null && predicate.test(e);
        }
    }

    public static class OnShowPress extends GestureListener {
        private final $Function<MotionEvent, Void> function;

        public OnShowPress($Function<MotionEvent, Void> function) {
            this.function = function;
        }

        @Override
        public void onShowPress(MotionEvent e) {
            function.apply(e);
        }
    }

    public static class OnSingleTapUp extends GestureListener {
        private final $Predicate<MotionEvent> predicate;

        public OnSingleTapUp($Predicate<MotionEvent> predicate) {
            this.predicate = predicate;
        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return predicate != null && predicate.test(e);
        }
    }

    public static class OnScroll extends GestureListener {
        private final  $QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate;

        public OnScroll($QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate) {
            this.quadPredicate = quadPredicate;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return quadPredicate != null && quadPredicate.test(e1, e2, distanceX, distanceY);
        }
    }

    public static class OnLongPress extends GestureListener {
        private final $Function<MotionEvent, Void> function;

        public OnLongPress($Function<MotionEvent, Void> function) {
            this.function = function;
        }

        @Override
        public void onLongPress(MotionEvent e) {
            function.apply(e);
        }
    }

    public static class OnFling extends GestureListener {
        private final $QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate;

        public OnFling($QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate) {
            this.quadPredicate = quadPredicate;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return quadPredicate != null && quadPredicate.test(e1, e2, velocityX, velocityY);
        }
    }
}