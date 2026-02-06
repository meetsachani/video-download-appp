package o;

/* renamed from: o.ui  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10040ui extends AbstractC3787Nw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public C10040ui(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        return;
                    }
                    throw new NullPointerException("Null cameraId");
                }
                throw new NullPointerException("Null model");
            }
            throw new NullPointerException("Null device");
        }
        throw new NullPointerException("Null brand");
    }

    @Override // o.AbstractC3787Nw
    public String b() {
        return this.a;
    }

    @Override // o.AbstractC3787Nw
    public String c() {
        return this.d;
    }

    @Override // o.AbstractC3787Nw
    public String d() {
        return this.b;
    }

    @Override // o.AbstractC3787Nw
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3787Nw) {
            AbstractC3787Nw abstractC3787Nw = (AbstractC3787Nw) obj;
            if (this.a.equals(abstractC3787Nw.b()) && this.b.equals(abstractC3787Nw.d()) && this.c.equals(abstractC3787Nw.e()) && this.d.equals(abstractC3787Nw.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CameraDeviceId{brand=" + this.a + ", device=" + this.b + ", model=" + this.c + ", cameraId=" + this.d + "}";
    }
}
