package o;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: o.Gw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3104Gw1 extends C3496Kw1 {

    /* renamed from: o.Gw1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final OutputConfiguration a;
        public String b;
        public boolean c;
        public long d = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Objects.equals(this.a, aVar.a) || this.c != aVar.c || this.d != aVar.d || !Objects.equals(this.b, aVar.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() ^ 31;
            int i = (this.c ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
            int i2 = (i << 5) - i;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = hashCode ^ i2;
            return Long.hashCode(this.d) ^ ((i3 << 5) - i3);
        }
    }

    public C3104Gw1(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    public static C3104Gw1 o(OutputConfiguration outputConfiguration) {
        return new C3104Gw1(new a(outputConfiguration));
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public void c(long j) {
        ((a) this.a).d = j;
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public void e(String str) {
        ((a) this.a).b = str;
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public List<Surface> g() {
        return Collections.singletonList(getSurface());
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public Surface getSurface() {
        return ((OutputConfiguration) m()).getSurface();
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public int h() {
        return ((OutputConfiguration) m()).getSurfaceGroupId();
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public String i() {
        return ((a) this.a).b;
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public void j() {
        ((a) this.a).c = true;
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public long l() {
        return ((a) this.a).d;
    }

    @Override // o.C3496Kw1, o.C3006Fw1.a
    public Object m() {
        C10907yF1.a(this.a instanceof a);
        return ((a) this.a).a;
    }

    @Override // o.C3496Kw1
    public boolean n() {
        return ((a) this.a).c;
    }

    public C3104Gw1(int i, Surface surface) {
        this(new a(new OutputConfiguration(i, surface)));
    }

    public C3104Gw1(Object obj) {
        super(obj);
    }
}
