package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: o.xh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10771xh2 extends Closeable {

    /* renamed from: o.xh2$b */
    /* loaded from: classes.dex */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        /* renamed from: o.xh2$b$a */
        /* loaded from: classes.dex */
        public static class a {
            public Context a;
            public String b;
            public a c;
            public boolean d;

            public a(Context context) {
                this.a = context;
            }

            public b a() {
                if (this.c != null) {
                    if (this.a != null) {
                        if (this.d && TextUtils.isEmpty(this.b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.a, this.b, this.c, this.d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.c = aVar;
                return this;
            }

            public a c(String str) {
                this.b = str;
                return this;
            }

            public a d(boolean z) {
                this.d = z;
                return this;
            }
        }

        public b(Context context, String str, a aVar) {
            this(context, str, aVar, false);
        }

        public static a a(Context context) {
            return new a(context);
        }

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }
    }

    /* renamed from: o.xh2$c */
    /* loaded from: classes.dex */
    public interface c {
        InterfaceC10771xh2 a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    InterfaceC10528wh2 getReadableDatabase();

    InterfaceC10528wh2 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);

    /* renamed from: o.xh2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static final String b = "SupportSQLite";
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w(b, "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w(b, "delete failed: ", e);
                }
            }
        }

        public void c(InterfaceC10528wh2 interfaceC10528wh2) {
            Log.e(b, "Corruption reported by sqlite on database: " + interfaceC10528wh2.Y());
            if (!interfaceC10528wh2.isOpen()) {
                a(interfaceC10528wh2.Y());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = interfaceC10528wh2.F0();
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            a((String) next.second);
                        }
                    } else {
                        a(interfaceC10528wh2.Y());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                interfaceC10528wh2.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(InterfaceC10528wh2 interfaceC10528wh2);

        public void e(InterfaceC10528wh2 interfaceC10528wh2, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        public abstract void g(InterfaceC10528wh2 interfaceC10528wh2, int i, int i2);

        public void b(InterfaceC10528wh2 interfaceC10528wh2) {
        }

        public void f(InterfaceC10528wh2 interfaceC10528wh2) {
        }
    }
}
