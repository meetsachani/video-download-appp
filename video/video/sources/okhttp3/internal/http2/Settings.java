package okhttp3.internal.http2;

import o.C4788Ye;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Settings {
    public static final int COUNT = 10;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    @NotNull
    private final int[] values = new int[10];

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private Companion() {
        }
    }

    public final void clear() {
        this.set = 0;
        C4788Ye.T1(this.values, 0, 0, 0, 6, null);
    }

    public final int get(int i) {
        return this.values[i];
    }

    public final boolean getEnablePush(boolean z) {
        if ((this.set & 4) != 0) {
            if (this.values[2] == 1) {
                return true;
            }
            return false;
        }
        return z;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i) {
        if ((this.set & 32) != 0) {
            return this.values[5];
        }
        return i;
    }

    public final int getMaxHeaderListSize(int i) {
        if ((this.set & 64) != 0) {
            return this.values[6];
        }
        return i;
    }

    public final boolean isSet(int i) {
        if (((1 << i) & this.set) != 0) {
            return true;
        }
        return false;
    }

    public final void merge(@NotNull Settings settings) {
        C6562gT0.p(settings, "other");
        for (int i = 0; i < 10; i++) {
            if (settings.isSet(i)) {
                set(i, settings.get(i));
            }
        }
    }

    @NotNull
    public final Settings set(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.values;
            if (i < iArr.length) {
                this.set = (1 << i) | this.set;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
