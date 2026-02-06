package o;

import android.database.sqlite.SQLiteStatement;

/* renamed from: o.jA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7213jA0 extends C6972iA0 implements InterfaceC2546Bh2 {
    public final SQLiteStatement Y;

    public C7213jA0(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.Y = sQLiteStatement;
    }

    @Override // o.InterfaceC2546Bh2
    public String L1() {
        return this.Y.simpleQueryForString();
    }

    @Override // o.InterfaceC2546Bh2
    public int T0() {
        return this.Y.executeUpdateDelete();
    }

    @Override // o.InterfaceC2546Bh2
    public long U2() {
        return this.Y.executeInsert();
    }

    @Override // o.InterfaceC2546Bh2
    public void execute() {
        this.Y.execute();
    }

    @Override // o.InterfaceC2546Bh2
    public long k3() {
        return this.Y.simpleQueryForLong();
    }
}
