import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureDetectors {
    public static class OnDown implements GestureDetector.OnGestureListener {
        private final $Predicate<MotionEvent> predicate;

        public OnDown($Predicate<MotionEvent> predicate) {
            this.predicate = predicate;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return predicate != null && predicate.test(e);
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }

    public static class OnShowPress implements GestureDetector.OnGestureListener {
        private final $Function<MotionEvent, Void> function;

        public OnShowPress($Function<MotionEvent, Void> function) {
            this.function = function;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {
            function.apply(e);
        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }

    public static class OnSingleTapUp implements GestureDetector.OnGestureListener {
        private final $Predicate<MotionEvent> predicate;

        public OnSingleTapUp($Predicate<MotionEvent> predicate) {
            this.predicate = predicate;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return predicate != null && predicate.test(e);

        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }

    public static class OnScroll implements GestureDetector.OnGestureListener {
        private final  $QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate;

        public OnScroll($QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate) {
            this.quadPredicate = quadPredicate;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return quadPredicate != null && quadPredicate.test(e1, e2, distanceX, distanceY);
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }

    public static class OnLongPress implements GestureDetector.OnGestureListener {
        private final $Function<MotionEvent, Void> function;

        public OnLongPress($Function<MotionEvent, Void> function) {
            this.function = function;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {
            function.apply(e);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }

    public static class OnFling implements GestureDetector.OnGestureListener {
        private final $QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate;

        public OnFling($QuadPredicate<MotionEvent, MotionEvent, Float, Float> quadPredicate) {
            this.quadPredicate = quadPredicate;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return quadPredicate != null && quadPredicate.test(e1, e2, velocityX, velocityY);
        }
    }
}