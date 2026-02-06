package o;

import java.io.Closeable;

@Deprecated
/* loaded from: classes2.dex */
public interface I50 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    int getPosition();

    default boolean isAfterLast() {
        if (getCount() == 0 || getPosition() == getCount()) {
            return true;
        }
        return false;
    }

    default boolean isBeforeFirst() {
        if (getCount() == 0 || getPosition() == -1) {
            return true;
        }
        return false;
    }

    boolean isClosed();

    default boolean isFirst() {
        if (getPosition() == 0 && getCount() != 0) {
            return true;
        }
        return false;
    }

    default boolean isLast() {
        int count = getCount();
        if (getPosition() == count - 1 && count != 0) {
            return true;
        }
        return false;
    }

    default boolean moveToFirst() {
        return moveToPosition(0);
    }

    default boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    default boolean moveToNext() {
        return moveToPosition(getPosition() + 1);
    }

    boolean moveToPosition(int i);

    default boolean moveToPrevious() {
        return moveToPosition(getPosition() - 1);
    }

    G50 v2();
}
