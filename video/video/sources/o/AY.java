package o;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

@Deprecated
/* loaded from: classes2.dex */
public final class AY implements InterfaceC5100aV {
    public final SQLiteOpenHelper X;

    public AY(SQLiteOpenHelper sQLiteOpenHelper) {
        this.X = sQLiteOpenHelper;
    }

    @Override // o.InterfaceC5100aV
    public SQLiteDatabase getReadableDatabase() {
        return this.X.getReadableDatabase();
    }

    @Override // o.InterfaceC5100aV
    public SQLiteDatabase getWritableDatabase() {
        return this.X.getWritableDatabase();
    }
}
