package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: o.fA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6231fA0 implements InterfaceC10528wh2 {
    public static final String[] Y = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] Z = new String[0];
    public final SQLiteDatabase X;

    /* renamed from: o.fA0$a */
    /* loaded from: classes.dex */
    public class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ InterfaceC11257zh2 a;

        public a(InterfaceC11257zh2 interfaceC11257zh2) {
            this.a = interfaceC11257zh2;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.f(new C6972iA0(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: o.fA0$b */
    /* loaded from: classes.dex */
    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ InterfaceC11257zh2 a;

        public b(InterfaceC11257zh2 interfaceC11257zh2) {
            this.a = interfaceC11257zh2;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.f(new C6972iA0(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C6231fA0(SQLiteDatabase sQLiteDatabase) {
        this.X = sQLiteDatabase;
    }

    @Override // o.InterfaceC10528wh2
    public long A4(String str, int i, ContentValues contentValues) throws SQLException {
        return this.X.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // o.InterfaceC10528wh2
    public List<Pair<String, String>> F0() {
        return this.X.getAttachedDbs();
    }

    @Override // o.InterfaceC10528wh2
    public void J0() {
        this.X.disableWriteAheadLogging();
    }

    @Override // o.InterfaceC10528wh2
    public void K0(String str) throws SQLException {
        this.X.execSQL(str);
    }

    @Override // o.InterfaceC10528wh2
    public boolean P0() {
        return this.X.isDatabaseIntegrityOk();
    }

    @Override // o.InterfaceC10528wh2
    public void S1(SQLiteTransactionListener sQLiteTransactionListener) {
        this.X.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // o.InterfaceC10528wh2
    public boolean V1() {
        return this.X.isDbLockedByCurrentThread();
    }

    @Override // o.InterfaceC10528wh2
    public void V4(SQLiteTransactionListener sQLiteTransactionListener) {
        this.X.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // o.InterfaceC10528wh2
    public void W1() {
        this.X.endTransaction();
    }

    @Override // o.InterfaceC10528wh2
    public boolean W4() {
        return this.X.inTransaction();
    }

    @Override // o.InterfaceC10528wh2
    public String Y() {
        return this.X.getPath();
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        if (this.X == sQLiteDatabase) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10528wh2
    public void c4(boolean z) {
        this.X.setForeignKeyConstraintsEnabled(z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
    }

    @Override // o.InterfaceC10528wh2
    public int d0() {
        return this.X.getVersion();
    }

    @Override // o.InterfaceC10528wh2
    public boolean d2(int i) {
        return this.X.needUpgrade(i);
    }

    @Override // o.InterfaceC10528wh2
    public boolean isOpen() {
        return this.X.isOpen();
    }

    @Override // o.InterfaceC10528wh2
    public boolean isReadOnly() {
        return this.X.isReadOnly();
    }

    @Override // o.InterfaceC10528wh2
    public boolean j3(long j) {
        return this.X.yieldIfContendedSafely(j);
    }

    @Override // o.InterfaceC10528wh2
    public long j4() {
        return this.X.getMaximumSize();
    }

    @Override // o.InterfaceC10528wh2
    public int k4(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int length;
        String str3;
        if (contentValues != null && contentValues.size() != 0) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(Y[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (objArr == null) {
                length = size;
            } else {
                length = objArr.length + size;
            }
            Object[] objArr2 = new Object[length];
            int i2 = 0;
            for (String str4 : contentValues.keySet()) {
                if (i2 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(str4);
                objArr2[i2] = contentValues.get(str4);
                sb.append("=?");
                i2++;
            }
            if (objArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr2[i3] = objArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            InterfaceC2546Bh2 z3 = z3(sb.toString());
            Z72.c(z3, objArr2);
            return z3.T0();
        }
        throw new IllegalArgumentException("Empty values");
    }

    @Override // o.InterfaceC10528wh2
    public Cursor l3(String str, Object[] objArr) {
        return y1(new Z72(str, objArr));
    }

    @Override // o.InterfaceC10528wh2
    public boolean l5() {
        return this.X.isWriteAheadLoggingEnabled();
    }

    @Override // o.InterfaceC10528wh2
    public long n1() {
        return this.X.getPageSize();
    }

    @Override // o.InterfaceC10528wh2
    public void o5(int i) {
        this.X.setMaxSqlCacheSize(i);
    }

    @Override // o.InterfaceC10528wh2
    public void p3(int i) {
        this.X.setVersion(i);
    }

    @Override // o.InterfaceC10528wh2
    public boolean q1() {
        return this.X.enableWriteAheadLogging();
    }

    @Override // o.InterfaceC10528wh2
    public boolean r4() {
        return this.X.yieldIfContendedSafely();
    }

    @Override // o.InterfaceC10528wh2
    public void r5(long j) {
        this.X.setPageSize(j);
    }

    @Override // o.InterfaceC10528wh2
    public void s1() {
        this.X.setTransactionSuccessful();
    }

    @Override // o.InterfaceC10528wh2
    public void setLocale(Locale locale) {
        this.X.setLocale(locale);
    }

    @Override // o.InterfaceC10528wh2
    public int t0(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb.append(str3);
        InterfaceC2546Bh2 z3 = z3(sb.toString());
        Z72.c(z3, objArr);
        return z3.T0();
    }

    @Override // o.InterfaceC10528wh2
    public void u1(String str, Object[] objArr) throws SQLException {
        this.X.execSQL(str, objArr);
    }

    @Override // o.InterfaceC10528wh2
    public Cursor u4(String str) {
        return y1(new Z72(str));
    }

    @Override // o.InterfaceC10528wh2
    public void v1() {
        this.X.beginTransactionNonExclusive();
    }

    @Override // o.InterfaceC10528wh2
    public void w0() {
        this.X.beginTransaction();
    }

    @Override // o.InterfaceC10528wh2
    public Cursor x3(InterfaceC11257zh2 interfaceC11257zh2, CancellationSignal cancellationSignal) {
        return this.X.rawQueryWithFactory(new b(interfaceC11257zh2), interfaceC11257zh2.d(), Z, null, cancellationSignal);
    }

    @Override // o.InterfaceC10528wh2
    public Cursor y1(InterfaceC11257zh2 interfaceC11257zh2) {
        return this.X.rawQueryWithFactory(new a(interfaceC11257zh2), interfaceC11257zh2.d(), Z, null);
    }

    @Override // o.InterfaceC10528wh2
    public long z1(long j) {
        return this.X.setMaximumSize(j);
    }

    @Override // o.InterfaceC10528wh2
    public InterfaceC2546Bh2 z3(String str) {
        return new C7213jA0(this.X.compileStatement(str));
    }
}
