package o;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class NC1 {
    public static final String g = "name";
    public static final String h = "icon";
    public static final String i = "uri";
    public static final String j = "key";
    public static final String k = "isBot";
    public static final String l = "isImportant";
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    /* loaded from: classes.dex */
    public static class a {
        public static NC1 a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean(NC1.k)).d(persistableBundle.getBoolean(NC1.l)).a();
        }

        public static PersistableBundle b(NC1 nc1) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = nc1.a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString("name", str);
            persistableBundle.putString("uri", nc1.c);
            persistableBundle.putString("key", nc1.d);
            persistableBundle.putBoolean(NC1.k, nc1.e);
            persistableBundle.putBoolean(NC1.l, nc1.f);
            return persistableBundle;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static NC1 a(Person person) {
            IconCompat iconCompat;
            c f = new c().f(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.l(person.getIcon());
            } else {
                iconCompat = null;
            }
            return f.c(iconCompat).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        public static Person b(NC1 nc1) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(nc1.f());
            if (nc1.d() != null) {
                icon = nc1.d().K();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(nc1.g()).setKey(nc1.e()).setBot(nc1.h()).setImportant(nc1.i()).build();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public CharSequence a;
        public IconCompat b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;

        public c() {
        }

        public NC1 a() {
            return new NC1(this);
        }

        public c b(boolean z) {
            this.e = z;
            return this;
        }

        public c c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public c d(boolean z) {
            this.f = z;
            return this;
        }

        public c e(String str) {
            this.d = str;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public c g(String str) {
            this.c = str;
            return this;
        }

        public c(NC1 nc1) {
            this.a = nc1.a;
            this.b = nc1.b;
            this.c = nc1.c;
            this.d = nc1.d;
            this.e = nc1.e;
            this.f = nc1.f;
        }
    }

    public NC1(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
    }

    public static NC1 a(Person person) {
        return b.a(person);
    }

    public static NC1 b(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        c f = new c().f(bundle.getCharSequence("name"));
        if (bundle2 != null) {
            iconCompat = IconCompat.j(bundle2);
        } else {
            iconCompat = null;
        }
        return f.c(iconCompat).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean(k)).d(bundle.getBoolean(l)).a();
    }

    public static NC1 c(PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    public IconCompat d() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NC1)) {
            return false;
        }
        NC1 nc1 = (NC1) obj;
        String e = e();
        String e2 = nc1.e();
        if (e == null && e2 == null) {
            if (!Objects.equals(Objects.toString(f()), Objects.toString(nc1.f())) || !Objects.equals(g(), nc1.g()) || !Boolean.valueOf(h()).equals(Boolean.valueOf(nc1.h())) || !Boolean.valueOf(i()).equals(Boolean.valueOf(nc1.i()))) {
                return false;
            }
            return true;
        }
        return Objects.equals(e, e2);
    }

    public CharSequence f() {
        return this.a;
    }

    public String g() {
        return this.c;
    }

    public boolean h() {
        return this.e;
    }

    public int hashCode() {
        String e = e();
        if (e != null) {
            return e.hashCode();
        }
        return Objects.hash(f(), g(), Boolean.valueOf(h()), Boolean.valueOf(i()));
    }

    public boolean i() {
        return this.f;
    }

    public String j() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.a != null) {
            return "name:" + ((Object) this.a);
        }
        return "";
    }

    public Person k() {
        return b.b(this);
    }

    public c l() {
        return new c(this);
    }

    public Bundle m() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            bundle = iconCompat.J();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.c);
        bundle2.putString("key", this.d);
        bundle2.putBoolean(k, this.e);
        bundle2.putBoolean(l, this.f);
        return bundle2;
    }

    public PersistableBundle n() {
        return a.b(this);
    }
}
