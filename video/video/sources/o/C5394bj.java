package o;

import android.net.Uri;

/* renamed from: o.bj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5394bj extends AbstractC5452bx1 {
    public final Uri a;

    public C5394bj(Uri uri) {
        if (uri != null) {
            this.a = uri;
            return;
        }
        throw new NullPointerException("Null outputUri");
    }

    @Override // o.AbstractC5452bx1
    public Uri a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5452bx1) {
            return this.a.equals(((AbstractC5452bx1) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
