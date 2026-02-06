package o;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes2.dex */
public final class ZY implements InterfaceC4809Yj0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f684o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final a p = new a(new a.InterfaceC0255a() { // from class: o.XY
        @Override // o.ZY.a.InterfaceC0255a
        public final Constructor a() {
            Constructor g;
            g = ZY.g();
            return g;
        }
    });
    public static final a q = new a(new a.InterfaceC0255a() { // from class: o.YY
        @Override // o.ZY.a.InterfaceC0255a
        public final Constructor a() {
            Constructor h;
            h = ZY.h();
            return h;
        }
    });
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int l;
    @InterfaceC11300zs1
    public AbstractC5317bO0<C10833xx0> m;
    public int k = 1;
    public int n = Xu2.B;

    /* loaded from: classes2.dex */
    public static final class a {
        public final InterfaceC0255a a;
        public final AtomicBoolean b = new AtomicBoolean(false);
        @InterfaceC8710pF0("extensionLoaded")
        @InterfaceC11300zs1
        public Constructor<? extends InterfaceC4324Tj0> c;

        /* renamed from: o.ZY$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC0255a {
            @InterfaceC11300zs1
            Constructor<? extends InterfaceC4324Tj0> a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public a(InterfaceC0255a interfaceC0255a) {
            this.a = interfaceC0255a;
        }

        @InterfaceC11300zs1
        public InterfaceC4324Tj0 a(Object... objArr) {
            Constructor<? extends InterfaceC4324Tj0> b = b();
            if (b == null) {
                return null;
            }
            try {
                return b.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        @InterfaceC11300zs1
        public final Constructor<? extends InterfaceC4324Tj0> b() {
            synchronized (this.b) {
                if (this.b.get()) {
                    return this.c;
                }
                try {
                    return this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                    return this.c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }

    @InterfaceC11300zs1
    public static Constructor<? extends InterfaceC4324Tj0> g() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return null;
        }
        return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC4324Tj0.class).getConstructor(Integer.TYPE);
    }

    public static Constructor<? extends InterfaceC4324Tj0> h() throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC4324Tj0.class).getConstructor(null);
    }

    @Override // o.InterfaceC4809Yj0
    public synchronized InterfaceC4324Tj0[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f684o;
            arrayList = new ArrayList(iArr.length);
            int b = C4940Zp0.b(map);
            if (b != -1) {
                f(b, arrayList);
            }
            int c = C4940Zp0.c(uri);
            if (c != -1 && c != b) {
                f(c, arrayList);
            }
            for (int i : iArr) {
                if (i != b && i != c) {
                    f(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4324Tj0[]) arrayList.toArray(new InterfaceC4324Tj0[arrayList.size()]);
    }

    @Override // o.InterfaceC4809Yj0
    public synchronized InterfaceC4324Tj0[] b() {
        return a(Uri.EMPTY, new HashMap());
    }

    public final void f(int i, List<InterfaceC4324Tj0> list) {
        int i2 = 2;
        switch (i) {
            case 0:
                list.add(new G3());
                return;
            case 1:
                list.add(new K3());
                return;
            case 2:
                int i3 = this.d | (this.b ? 1 : 0);
                if (!this.c) {
                    i2 = 0;
                }
                list.add(new L7(i2 | i3));
                return;
            case 3:
                int i4 = this.e | (this.b ? 1 : 0);
                if (!this.c) {
                    i2 = 0;
                }
                list.add(new E8(i2 | i4));
                return;
            case 4:
                InterfaceC4324Tj0 a2 = p.a(Integer.valueOf(this.f));
                if (a2 != null) {
                    list.add(a2);
                    return;
                } else {
                    list.add(new C3489Ku0(this.f));
                    return;
                }
            case 5:
                list.add(new C2504Aw0());
                return;
            case 6:
                list.add(new C10997yd1(this.g));
                return;
            case 7:
                int i5 = this.j | (this.b ? 1 : 0);
                if (!this.c) {
                    i2 = 0;
                }
                list.add(new C11029yl1(i2 | i5));
                return;
            case 8:
                list.add(new C3894Oz0(this.i));
                list.add(new C2561Bl1(this.h));
                return;
            case 9:
                list.add(new C7392ju1());
                return;
            case 10:
                list.add(new CK1());
                return;
            case 11:
                if (this.m == null) {
                    this.m = AbstractC5317bO0.L();
                }
                list.add(new Xu2(this.k, new C10071up2(0L), new C10118v10(this.l, this.m), this.n));
                return;
            case 12:
                list.add(new BJ2());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new C8773pV0());
                return;
            case 15:
                InterfaceC4324Tj0 a3 = q.a(new Object[0]);
                if (a3 != null) {
                    list.add(a3);
                    return;
                }
                return;
            case 16:
                list.add(new C4126Rj());
                return;
        }
    }

    @InterfaceC6181ey
    public synchronized ZY i(int i) {
        this.d = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY j(int i) {
        this.e = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY k(boolean z) {
        this.c = z;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY l(boolean z) {
        this.b = z;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY m(int i) {
        this.f = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY n(int i) {
        this.i = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY o(int i) {
        this.g = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY p(int i) {
        this.j = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY q(int i) {
        this.h = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY r(int i) {
        this.l = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY s(int i) {
        this.k = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY t(int i) {
        this.n = i;
        return this;
    }

    @InterfaceC6181ey
    public synchronized ZY u(List<C10833xx0> list) {
        this.m = AbstractC5317bO0.F(list);
        return this;
    }
}
