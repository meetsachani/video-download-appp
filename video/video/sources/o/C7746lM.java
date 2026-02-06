package o;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.lM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7746lM {
    public final Set<a> a = new HashSet();

    /* renamed from: o.lM$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean triggerForDescendants) {
            this.a = uri;
            this.b = triggerForDescendants;
        }

        public Uri a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public boolean equals(Object o2) {
            if (this == o2) {
                return true;
            }
            if (o2 != null && a.class == o2.getClass()) {
                a aVar = (a) o2;
                if (this.b == aVar.b && this.a.equals(aVar.a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean triggerForDescendants) {
        this.a.add(new a(uri, triggerForDescendants));
    }

    public Set<a> b() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 != null && C7746lM.class == o2.getClass()) {
            return this.a.equals(((C7746lM) o2).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
