package o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import o.InterfaceC10771xh2;

/* renamed from: o.gA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6486gA0 implements InterfaceC10771xh2 {
    public final Context X;
    public final String Y;
    public final boolean Y0;
    public final InterfaceC10771xh2.a Z;
    public final Object Z0;
    public a a1;
    public boolean b1;

    /* renamed from: o.gA0$a */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        public final C6231fA0[] X;
        public final InterfaceC10771xh2.a Y;
        public boolean Z;

        /* renamed from: o.gA0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0281a implements DatabaseErrorHandler {
            public final /* synthetic */ InterfaceC10771xh2.a a;
            public final /* synthetic */ C6231fA0[] b;

            public C0281a(InterfaceC10771xh2.a aVar, C6231fA0[] c6231fA0Arr) {
                this.a = aVar;
                this.b = c6231fA0Arr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.f(this.b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, C6231fA0[] c6231fA0Arr, InterfaceC10771xh2.a aVar) {
            super(context, str, null, aVar.a, new C0281a(aVar, c6231fA0Arr));
            this.Y = aVar;
            this.X = c6231fA0Arr;
        }

        public static C6231fA0 f(C6231fA0[] c6231fA0Arr, SQLiteDatabase sQLiteDatabase) {
            C6231fA0 c6231fA0 = c6231fA0Arr[0];
            if (c6231fA0 == null || !c6231fA0.a(sQLiteDatabase)) {
                c6231fA0Arr[0] = new C6231fA0(sQLiteDatabase);
            }
            return c6231fA0Arr[0];
        }

        public synchronized InterfaceC10528wh2 a() {
            this.Z = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.Z) {
                close();
                return a();
            }
            return d(readableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.X[0] = null;
        }

        public C6231fA0 d(SQLiteDatabase sQLiteDatabase) {
            return f(this.X, sQLiteDatabase);
        }

        public synchronized InterfaceC10528wh2 h() {
            this.Z = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.Z) {
                close();
                return h();
            }
            return d(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.Y.b(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.Y.d(d(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.Z = true;
            this.Y.e(d(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.Z) {
                this.Y.f(d(sQLiteDatabase));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.Z = true;
            this.Y.g(d(sQLiteDatabase), i, i2);
        }
    }

    public C6486gA0(Context context, String str, InterfaceC10771xh2.a aVar) {
        this(context, str, aVar, false);
    }

    public final a a() {
        a aVar;
        synchronized (this.Z0) {
            try {
                if (this.a1 == null) {
                    C6231fA0[] c6231fA0Arr = new C6231fA0[1];
                    if (this.Y != null && this.Y0) {
                        this.a1 = new a(this.X, new File(this.X.getNoBackupFilesDir(), this.Y).getAbsolutePath(), c6231fA0Arr, this.Z);
                    } else {
                        this.a1 = new a(this.X, this.Y, c6231fA0Arr, this.Z);
                    }
                    this.a1.setWriteAheadLoggingEnabled(this.b1);
                }
                aVar = this.a1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // o.InterfaceC10771xh2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // o.InterfaceC10771xh2
    public String getDatabaseName() {
        return this.Y;
    }

    @Override // o.InterfaceC10771xh2
    public InterfaceC10528wh2 getReadableDatabase() {
        return a().a();
    }

    @Override // o.InterfaceC10771xh2
    public InterfaceC10528wh2 getWritableDatabase() {
        return a().h();
    }

    @Override // o.InterfaceC10771xh2
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.Z0) {
            try {
                a aVar = this.a1;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z);
                }
                this.b1 = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C6486gA0(Context context, String str, InterfaceC10771xh2.a aVar, boolean z) {
        this.X = context;
        this.Y = str;
        this.Z = aVar;
        this.Y0 = z;
        this.Z0 = new Object();
    }
}
