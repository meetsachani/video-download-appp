package o;

import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.C3006Fw1;

/* renamed from: o.Kw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3496Kw1 implements C3006Fw1.a {
    public static final String b = "OutputConfigCompat";
    public final Object a;

    /* renamed from: o.Kw1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int h = 1;
        public static final String i = "android.hardware.camera2.legacy.LegacyCameraDevice";
        public static final String j = "getSurfaceSize";
        public static final String k = "detectSurfaceType";
        public static final String l = "getGenerationId";
        public final List<Surface> a;
        public final Size b;
        public final int c;
        public final int d;
        public String e;
        public boolean f = false;
        public long g = 1;

        public a(Surface surface) {
            C10907yF1.m(surface, "Surface must not be null");
            this.a = Collections.singletonList(surface);
            this.b = c(surface);
            this.c = a(surface);
            this.d = b(surface);
        }

        public static int a(Surface surface) {
            try {
                return ((Integer) Class.forName(i).getDeclaredMethod(k, Surface.class).invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C7433k41.d(C3496Kw1.b, "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        public static int b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod(l, null).invoke(surface, null)).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C7433k41.d(C3496Kw1.b, "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        public static Size c(Surface surface) {
            try {
                Method declaredMethod = Class.forName(i).getDeclaredMethod(j, Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C7433k41.d(C3496Kw1.b, "Unable to retrieve surface size.", e);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.b.equals(aVar.b) || this.c != aVar.c || this.d != aVar.d || this.f != aVar.f || this.g != aVar.g || !Objects.equals(this.e, aVar.e)) {
                return false;
            }
            int min = Math.min(this.a.size(), aVar.a.size());
            for (int i2 = 0; i2 < min; i2++) {
                if (this.a.get(i2) != aVar.a.get(i2)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() ^ 31;
            int i2 = this.d ^ ((hashCode2 << 5) - hashCode2);
            int hashCode3 = this.b.hashCode() ^ ((i2 << 5) - i2);
            int i3 = this.c ^ ((hashCode3 << 5) - hashCode3);
            int i4 = (this.f ? 1 : 0) ^ ((i3 << 5) - i3);
            int i5 = (i4 << 5) - i4;
            String str = this.e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i6 = hashCode ^ i5;
            return Long.hashCode(this.g) ^ ((i6 << 5) - i6);
        }
    }

    public C3496Kw1(Surface surface) {
        this.a = new a(surface);
    }

    @Override // o.C3006Fw1.a
    public void b(Surface surface) {
        C10907yF1.m(surface, "Surface must not be null");
        if (getSurface() != surface) {
            if (!n()) {
                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
            }
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
        throw new IllegalStateException("Surface is already added!");
    }

    @Override // o.C3006Fw1.a
    public void c(long j) {
        ((a) this.a).g = j;
    }

    @Override // o.C3006Fw1.a
    public void d(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        throw new IllegalArgumentException("Surface is not part of this output configuration");
    }

    @Override // o.C3006Fw1.a
    public void e(String str) {
        ((a) this.a).e = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3496Kw1)) {
            return false;
        }
        return Objects.equals(this.a, ((C3496Kw1) obj).a);
    }

    @Override // o.C3006Fw1.a
    public int f() {
        return 1;
    }

    @Override // o.C3006Fw1.a
    public List<Surface> g() {
        return ((a) this.a).a;
    }

    @Override // o.C3006Fw1.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.a).a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // o.C3006Fw1.a
    public int h() {
        return -1;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // o.C3006Fw1.a
    public String i() {
        return ((a) this.a).e;
    }

    @Override // o.C3006Fw1.a
    public void j() {
        ((a) this.a).f = true;
    }

    @Override // o.C3006Fw1.a
    public long k() {
        return -1L;
    }

    @Override // o.C3006Fw1.a
    public long l() {
        return ((a) this.a).g;
    }

    @Override // o.C3006Fw1.a
    public Object m() {
        return null;
    }

    public boolean n() {
        return ((a) this.a).f;
    }

    public C3496Kw1(Object obj) {
        this.a = obj;
    }

    @Override // o.C3006Fw1.a
    public void a(long j) {
    }
}
