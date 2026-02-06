package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class CG2 {
    public final AbstractC5209ax1 a;
    public final AbstractC10461wP1 b;

    /* loaded from: classes.dex */
    public static final class a extends CG2 {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;
        public static final int k = 5;
        public static final int l = 6;
        public static final int m = 7;
        public static final int n = 8;

        /* renamed from: o  reason: collision with root package name */
        public static final int f424o = 9;
        public static final int p = 10;
        public final AbstractC5452bx1 c;
        public final int d;
        public final Throwable e;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.CG2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0168a {
        }

        public a(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1, AbstractC5452bx1 abstractC5452bx1, int i2, Throwable th) {
            super(abstractC5209ax1, abstractC10461wP1);
            this.c = abstractC5452bx1;
            this.d = i2;
            this.e = th;
        }

        public static String i(int i2) {
            switch (i2) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case 10:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    return "Unknown(" + i2 + C9811tl1.d;
            }
        }

        public Throwable j() {
            return this.e;
        }

        public int k() {
            return this.d;
        }

        public AbstractC5452bx1 l() {
            return this.c;
        }

        public boolean m() {
            if (this.d != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends CG2 {
        public b(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
            super(abstractC5209ax1, abstractC10461wP1);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends CG2 {
        public c(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
            super(abstractC5209ax1, abstractC10461wP1);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends CG2 {
        public d(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
            super(abstractC5209ax1, abstractC10461wP1);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends CG2 {
        public e(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
            super(abstractC5209ax1, abstractC10461wP1);
        }
    }

    public CG2(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
        this.a = (AbstractC5209ax1) C10907yF1.l(abstractC5209ax1);
        this.b = (AbstractC10461wP1) C10907yF1.l(abstractC10461wP1);
    }

    public static a a(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1, AbstractC5452bx1 abstractC5452bx1) {
        return new a(abstractC5209ax1, abstractC10461wP1, abstractC5452bx1, 0, null);
    }

    public static a b(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1, AbstractC5452bx1 abstractC5452bx1, int i, Throwable th) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "An error type is required.");
        return new a(abstractC5209ax1, abstractC10461wP1, abstractC5452bx1, i, th);
    }

    public static b e(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
        return new b(abstractC5209ax1, abstractC10461wP1);
    }

    public static c f(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
        return new c(abstractC5209ax1, abstractC10461wP1);
    }

    public static d g(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
        return new d(abstractC5209ax1, abstractC10461wP1);
    }

    public static e h(AbstractC5209ax1 abstractC5209ax1, AbstractC10461wP1 abstractC10461wP1) {
        return new e(abstractC5209ax1, abstractC10461wP1);
    }

    public AbstractC5209ax1 c() {
        return this.a;
    }

    public AbstractC10461wP1 d() {
        return this.b;
    }
}
