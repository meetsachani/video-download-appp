package o;

import android.database.sqlite.SQLiteProgram;

/* renamed from: o.iA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6972iA0 implements InterfaceC11014yh2 {
    public final SQLiteProgram X;

    public C6972iA0(SQLiteProgram sQLiteProgram) {
        this.X = sQLiteProgram;
    }

    @Override // o.InterfaceC11014yh2
    public void O4(int i) {
        this.X.bindNull(i);
    }

    @Override // o.InterfaceC11014yh2
    public void c1(int i, double d) {
        this.X.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    @Override // o.InterfaceC11014yh2
    public void g4(int i, long j) {
        this.X.bindLong(i, j);
    }

    @Override // o.InterfaceC11014yh2
    public void p4(int i, byte[] bArr) {
        this.X.bindBlob(i, bArr);
    }

    @Override // o.InterfaceC11014yh2
    public void r3(int i, String str) {
        this.X.bindString(i, str);
    }

    @Override // o.InterfaceC11014yh2
    public void t5() {
        this.X.clearBindings();
    }
}
