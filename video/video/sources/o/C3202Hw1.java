package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/* renamed from: o.Hw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3202Hw1 extends C3104Gw1 {
    public static final String c = "MAX_SURFACES_COUNT";
    public static final String d = "mSurfaces";

    /* renamed from: o.Hw1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final OutputConfiguration a;
        public String b;
        public long c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Objects.equals(this.a, aVar.a) || this.c != aVar.c || !Objects.equals(this.b, aVar.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() ^ 31;
            int i = (hashCode2 << 5) - hashCode2;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode ^ i;
            return Long.hashCode(this.c) ^ ((i2 << 5) - i2);
        }
    }

    public C3202Hw1(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    public static int p() throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = OutputConfiguration.class.getDeclaredField(c);
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    public static List<Surface> q(OutputConfiguration outputConfiguration) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = OutputConfiguration.class.getDeclaredField(d);
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    public static C3202Hw1 r(OutputConfiguration outputConfiguration) {
        return new C3202Hw1(new a(outputConfiguration));
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public void b(Surface surface) {
        ((OutputConfiguration) m()).addSurface(surface);
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public void c(long j) {
        ((a) this.a).c = j;
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public void d(Surface surface) {
        if (getSurface() != surface) {
            try {
                if (q((OutputConfiguration) m()).remove(surface)) {
                    return;
                }
                throw new IllegalArgumentException("Surface is not part of this output configuration");
            } catch (IllegalAccessException | NoSuchFieldException e) {
                C7433k41.d(C3496Kw1.b, "Unable to remove surface from this output configuration.", e);
                return;
            }
        }
        throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public void e(String str) {
        ((a) this.a).b = str;
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public int f() {
        try {
            return p();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            C7433k41.d(C3496Kw1.b, "Unable to retrieve max shared surface count.", e);
            return super.f();
        }
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public List<Surface> g() {
        return ((OutputConfiguration) m()).getSurfaces();
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public String i() {
        return ((a) this.a).b;
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public void j() {
        ((OutputConfiguration) m()).enableSurfaceSharing();
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public long l() {
        return ((a) this.a).c;
    }

    @Override // o.C3104Gw1, o.C3496Kw1, o.C3006Fw1.a
    public Object m() {
        C10907yF1.a(this.a instanceof a);
        return ((a) this.a).a;
    }

    @Override // o.C3104Gw1, o.C3496Kw1
    public final boolean n() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public C3202Hw1(int i, Surface surface) {
        this(new a(new OutputConfiguration(i, surface)));
    }

    public C3202Hw1(Object obj) {
        super(obj);
    }
}
