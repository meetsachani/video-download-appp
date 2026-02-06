package o;

import android.net.Uri;

/* renamed from: o.aK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5060aK2 {
    public final Uri a;
    public final boolean b;

    public C5060aK2(Uri uri, boolean z) {
        C6562gT0.p(uri, "registrationUri");
        this.a = uri;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final Uri b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5060aK2)) {
            return false;
        }
        C5060aK2 c5060aK2 = (C5060aK2) obj;
        if (C6562gT0.g(this.a, c5060aK2.a) && this.b == c5060aK2.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.a + ", DebugKeyAllowed=" + this.b + " }";
    }
}
