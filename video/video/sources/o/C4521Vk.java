package o;

import o.C8068mc2;

/* renamed from: o.Vk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4521Vk extends C9210rH0 {
    public C8068mc2.c q0;
    public int r0;
    public C4327Tk s0;

    /* renamed from: o.Vk$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C8068mc2.c.values().length];
            a = iArr;
            try {
                iArr[C8068mc2.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C8068mc2.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C8068mc2.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C8068mc2.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C8068mc2.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[C8068mc2.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C4521Vk(C8068mc2 c8068mc2) {
        super(c8068mc2, C8068mc2.d.BARRIER);
    }

    @Override // o.C9210rH0
    public C9696tH0 R0() {
        if (this.s0 == null) {
            this.s0 = new C4327Tk();
        }
        return this.s0;
    }

    public void U0(C8068mc2.c cVar) {
        this.q0 = cVar;
    }

    @Override // o.C9210rH0, o.QK, o.TP1
    public void apply() {
        R0();
        int i = a.a[this.q0.ordinal()];
        int i2 = 3;
        if (i != 3 && i != 4) {
            if (i != 5) {
                if (i != 6) {
                    i2 = 0;
                }
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        this.s0.v2(i2);
        this.s0.w2(this.r0);
    }

    @Override // o.QK
    public QK e0(int i) {
        this.r0 = i;
        return this;
    }

    @Override // o.QK
    public QK f0(Object obj) {
        e0(this.m0.g(obj));
        return this;
    }
}
