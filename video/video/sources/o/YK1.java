package o;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public enum YK1 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    public static final SparseArray<YK1> c1;
    public final int X;

    static {
        YK1 yk1 = DEFAULT;
        YK1 yk12 = UNMETERED_ONLY;
        YK1 yk13 = UNMETERED_OR_DAILY;
        YK1 yk14 = FAST_IF_RADIO_AWAKE;
        YK1 yk15 = NEVER;
        YK1 yk16 = UNRECOGNIZED;
        SparseArray<YK1> sparseArray = new SparseArray<>();
        c1 = sparseArray;
        sparseArray.put(0, yk1);
        sparseArray.put(1, yk12);
        sparseArray.put(2, yk13);
        sparseArray.put(3, yk14);
        sparseArray.put(4, yk15);
        sparseArray.put(-1, yk16);
    }

    YK1(int i) {
        this.X = i;
    }

    @InterfaceC11300zs1
    public static YK1 e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public final int k() {
        return this.X;
    }
}
