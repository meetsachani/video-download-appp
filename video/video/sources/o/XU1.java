package o;

import android.database.Cursor;
import java.util.List;
import o.InterfaceC10771xh2;

/* loaded from: classes.dex */
public class XU1 extends InterfaceC10771xh2.a {
    public XU c;
    public final a d;
    public final String e;
    public final String f;

    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public XU1(XU xu, a aVar, String str, String str2) {
        super(aVar.a);
        this.c = xu;
        this.d = aVar;
        this.e = str;
        this.f = str2;
    }

    public static boolean j(InterfaceC10528wh2 interfaceC10528wh2) {
        Cursor u4 = interfaceC10528wh2.u4("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (u4.moveToFirst()) {
                if (u4.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            u4.close();
        }
    }

    public static boolean k(InterfaceC10528wh2 interfaceC10528wh2) {
        Cursor u4 = interfaceC10528wh2.u4("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (u4.moveToFirst()) {
                if (u4.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            u4.close();
        }
    }

    @Override // o.InterfaceC10771xh2.a
    public void b(InterfaceC10528wh2 interfaceC10528wh2) {
        super.b(interfaceC10528wh2);
    }

    @Override // o.InterfaceC10771xh2.a
    public void d(InterfaceC10528wh2 interfaceC10528wh2) {
        boolean j = j(interfaceC10528wh2);
        this.d.a(interfaceC10528wh2);
        if (!j) {
            b g = this.d.g(interfaceC10528wh2);
            if (!g.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.b);
            }
        }
        l(interfaceC10528wh2);
        this.d.c(interfaceC10528wh2);
    }

    @Override // o.InterfaceC10771xh2.a
    public void e(InterfaceC10528wh2 interfaceC10528wh2, int i, int i2) {
        g(interfaceC10528wh2, i, i2);
    }

    @Override // o.InterfaceC10771xh2.a
    public void f(InterfaceC10528wh2 interfaceC10528wh2) {
        super.f(interfaceC10528wh2);
        h(interfaceC10528wh2);
        this.d.d(interfaceC10528wh2);
        this.c = null;
    }

    @Override // o.InterfaceC10771xh2.a
    public void g(InterfaceC10528wh2 interfaceC10528wh2, int i, int i2) {
        List<AbstractC3739Nj1> c;
        XU xu = this.c;
        if (xu != null && (c = xu.d.c(i, i2)) != null) {
            this.d.f(interfaceC10528wh2);
            for (AbstractC3739Nj1 abstractC3739Nj1 : c) {
                abstractC3739Nj1.a(interfaceC10528wh2);
            }
            b g = this.d.g(interfaceC10528wh2);
            if (g.a) {
                this.d.e(interfaceC10528wh2);
                l(interfaceC10528wh2);
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle: " + g.b);
        }
        XU xu2 = this.c;
        if (xu2 != null && !xu2.a(i, i2)) {
            this.d.b(interfaceC10528wh2);
            this.d.a(interfaceC10528wh2);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void h(InterfaceC10528wh2 interfaceC10528wh2) {
        String str;
        if (k(interfaceC10528wh2)) {
            Cursor y1 = interfaceC10528wh2.y1(new Z72(WU1.g));
            try {
                if (y1.moveToFirst()) {
                    str = y1.getString(0);
                } else {
                    str = null;
                }
                y1.close();
                if (!this.e.equals(str) && !this.f.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th) {
                y1.close();
                throw th;
            }
        }
        b g = this.d.g(interfaceC10528wh2);
        if (g.a) {
            this.d.e(interfaceC10528wh2);
            l(interfaceC10528wh2);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.b);
    }

    public final void i(InterfaceC10528wh2 interfaceC10528wh2) {
        interfaceC10528wh2.K0(WU1.f);
    }

    public final void l(InterfaceC10528wh2 interfaceC10528wh2) {
        i(interfaceC10528wh2);
        interfaceC10528wh2.K0(WU1.a(this.e));
    }

    public XU1(XU xu, a aVar, String str) {
        this(xu, aVar, "", str);
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(InterfaceC10528wh2 interfaceC10528wh2);

        public abstract void b(InterfaceC10528wh2 interfaceC10528wh2);

        public abstract void c(InterfaceC10528wh2 interfaceC10528wh2);

        public abstract void d(InterfaceC10528wh2 interfaceC10528wh2);

        public b g(InterfaceC10528wh2 interfaceC10528wh2) {
            h(interfaceC10528wh2);
            return new b(true, null);
        }

        @Deprecated
        public void h(InterfaceC10528wh2 interfaceC10528wh2) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public void e(InterfaceC10528wh2 interfaceC10528wh2) {
        }

        public void f(InterfaceC10528wh2 interfaceC10528wh2) {
        }
    }
}
