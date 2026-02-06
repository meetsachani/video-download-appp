package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfn extends SQLiteOpenHelper {
    public final /* synthetic */ zzfo X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzfo zzfoVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.X = zzfoVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @InterfaceC10697xN2
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.X.j().G().a("Opening the local database failed, dropping and recreating it");
            if (!this.X.a().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.X.j().G().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.X.j().G().b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @InterfaceC10697xN2
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzat.b(this.X.j(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @InterfaceC10697xN2
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @InterfaceC10697xN2
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzat.c(this.X.j(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @InterfaceC10697xN2
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
