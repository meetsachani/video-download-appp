package o;

import android.graphics.Paint;
import java.util.List;

/* renamed from: o.e32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5962e32 implements InterfaceC6776hM {
    public final String a;
    public final C9177r9 b;
    public final List<C9177r9> c;
    public final C8928q9 d;
    public final C9663t9 e;
    public final C9177r9 f;
    public final b g;
    public final c h;
    public final float i;
    public final boolean j;

    /* renamed from: o.e32$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.e32$b */
    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap g() {
            int i = a.a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* renamed from: o.e32$c */
    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join g() {
            int i = a.b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public C5962e32(String str, C9177r9 c9177r9, List<C9177r9> list, C8928q9 c8928q9, C9663t9 c9663t9, C9177r9 c9177r92, b bVar, c cVar, float f, boolean z) {
        this.a = str;
        this.b = c9177r9;
        this.c = list;
        this.d = c8928q9;
        this.e = c9663t9;
        this.f = c9177r92;
        this.g = bVar;
        this.h = cVar;
        this.i = f;
        this.j = z;
    }

    @Override // o.InterfaceC6776hM
    public DL a(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol) {
        return new C3919Pf2(c8431o61, abstractC8588ol, this);
    }

    public b b() {
        return this.g;
    }

    public C8928q9 c() {
        return this.d;
    }

    public C9177r9 d() {
        return this.b;
    }

    public c e() {
        return this.h;
    }

    public List<C9177r9> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public C9663t9 i() {
        return this.e;
    }

    public C9177r9 j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
