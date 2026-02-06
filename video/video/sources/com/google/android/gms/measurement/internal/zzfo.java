package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.ArrayList;
import java.util.List;
import o.C2638Cg0;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzfo extends zze {
    public final zzfn c;
    public boolean d;

    public zzfo(zzhf zzhfVar) {
        super(zzhfVar);
        this.c = new zzfn(this, a(), "google_app_measurement_local.db");
    }

    public static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{C2638Cg0.Z4}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            cursor.close();
            return -1L;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC5056aJ2
    private final boolean L() {
        return a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean A() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AbstractSafeParcelable> C(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        String str;
        String[] strArr;
        Parcel obtain;
        zznc zzncVar;
        zzad zzadVar;
        n();
        Cursor cursor2 = null;
        if (this.d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!L()) {
            return arrayList;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                sQLiteDatabase = K();
                if (sQLiteDatabase == null) {
                    this.d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return null;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    long B = B(sQLiteDatabase);
                    long j = -1;
                    if (B != -1) {
                        strArr = new String[]{String.valueOf(B)};
                        str = "rowid<?";
                    } else {
                        str = null;
                        strArr = null;
                    }
                    cursor = sQLiteDatabase.query("messages", new String[]{"rowid", "type", DefaultsXmlParser.a}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                    while (cursor.moveToNext()) {
                        try {
                            j = cursor.getLong(0);
                            int i4 = cursor.getInt(1);
                            byte[] blob = cursor.getBlob(2);
                            if (i4 == 0) {
                                obtain = Parcel.obtain();
                                try {
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        zzbg createFromParcel = zzbg.CREATOR.createFromParcel(obtain);
                                        if (createFromParcel != null) {
                                            arrayList.add(createFromParcel);
                                        }
                                    } catch (SafeParcelReader.ParseException unused) {
                                        j().G().a("Failed to load event from local database");
                                        obtain.recycle();
                                    }
                                } finally {
                                }
                            } else if (i4 == 1) {
                                obtain = Parcel.obtain();
                                try {
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        zzncVar = zznc.CREATOR.createFromParcel(obtain);
                                    } catch (SafeParcelReader.ParseException unused2) {
                                        j().G().a("Failed to load user property from local database");
                                        obtain.recycle();
                                        zzncVar = null;
                                    }
                                    if (zzncVar != null) {
                                        arrayList.add(zzncVar);
                                    }
                                } finally {
                                }
                            } else if (i4 == 2) {
                                obtain = Parcel.obtain();
                                try {
                                    try {
                                        obtain.unmarshall(blob, 0, blob.length);
                                        obtain.setDataPosition(0);
                                        zzadVar = zzad.CREATOR.createFromParcel(obtain);
                                    } catch (SafeParcelReader.ParseException unused3) {
                                        j().G().a("Failed to load conditional user property from local database");
                                        obtain.recycle();
                                        zzadVar = null;
                                    }
                                    if (zzadVar != null) {
                                        arrayList.add(zzadVar);
                                    }
                                } finally {
                                }
                            } else if (i4 == 3) {
                                j().L().a("Skipping app launch break");
                            } else {
                                j().G().a("Unknown record type in local database");
                            }
                        } catch (SQLiteDatabaseLockedException unused4) {
                            SystemClock.sleep(i2);
                            i2 += 20;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            j().G().b("Error reading entries from local database", e);
                            this.d = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            j().G().b("Error reading entries from local database", e);
                            this.d = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                        }
                    }
                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                        j().G().a("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    cursor.close();
                    sQLiteDatabase.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused5) {
                    cursor = null;
                } catch (SQLiteFullException e3) {
                    e = e3;
                    cursor = null;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor2 != null) {
                    }
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused6) {
                sQLiteDatabase = null;
                cursor = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabase = null;
                cursor = null;
            } catch (SQLiteException e6) {
                e = e6;
                sQLiteDatabase = null;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = null;
            }
        }
        j().L().a("Failed to read events from database in reasonable time");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015b  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        n();
        ?? r2 = 0;
        if (this.d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put(DefaultsXmlParser.a, bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor2 = null;
            r7 = null;
            r7 = null;
            cursor2 = null;
            r7 = null;
            Cursor cursor3 = null;
            Cursor cursor4 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = K();
                if (sQLiteDatabase == null) {
                    try {
                        try {
                            this.d = true;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            return r2;
                        } catch (SQLiteFullException e) {
                            e = e;
                            z = r2;
                            j().G().b("Error writing entry; local database full", e);
                            this.d = true;
                            if (cursor4 != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            i2++;
                            r2 = z;
                        } catch (SQLiteException e2) {
                            e = e2;
                            z3 = r2;
                            cursor = null;
                            z2 = true;
                            z4 = z3;
                            sQLiteDatabase2 = sQLiteDatabase;
                            z = z4;
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            j().G().b("Error writing entry to local database", e);
                            this.d = z2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                sQLiteDatabase2.close();
                            }
                            i2++;
                            r2 = z;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor2 != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } else {
                    try {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            if (cursor != null) {
                                try {
                                    try {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                j = cursor.getLong(r2);
                                                if (j >= 100000) {
                                                    try {
                                                        j().G().a("Data loss, local db full");
                                                        long j2 = 100001 - j;
                                                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                                        if (delete != j2) {
                                                            z5 = r2;
                                                            try {
                                                                try {
                                                                    z2 = true;
                                                                } catch (SQLiteFullException e3) {
                                                                    e = e3;
                                                                    z6 = z5;
                                                                    cursor4 = cursor;
                                                                    z = z6;
                                                                    j().G().b("Error writing entry; local database full", e);
                                                                    this.d = true;
                                                                    if (cursor4 != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                } catch (SQLiteException e4) {
                                                                    e = e4;
                                                                    z3 = z5;
                                                                    z2 = true;
                                                                    z4 = z3;
                                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                                    z = z4;
                                                                    if (sQLiteDatabase2 != null) {
                                                                    }
                                                                    j().G().b("Error writing entry to local database", e);
                                                                    this.d = z2;
                                                                    if (cursor != null) {
                                                                    }
                                                                    if (sQLiteDatabase2 == null) {
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                }
                                                                try {
                                                                    j().G().d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                                                    z5 = z5;
                                                                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                                                    sQLiteDatabase.setTransactionSuccessful();
                                                                    sQLiteDatabase.endTransaction();
                                                                    if (cursor != 0) {
                                                                        cursor.close();
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    return z2;
                                                                } catch (SQLiteFullException e5) {
                                                                    e = e5;
                                                                    z6 = z5;
                                                                    cursor4 = cursor;
                                                                    z = z6;
                                                                    j().G().b("Error writing entry; local database full", e);
                                                                    this.d = true;
                                                                    if (cursor4 != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    z4 = z5;
                                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                                    z = z4;
                                                                    if (sQLiteDatabase2 != null) {
                                                                    }
                                                                    j().G().b("Error writing entry to local database", e);
                                                                    this.d = z2;
                                                                    if (cursor != null) {
                                                                    }
                                                                    if (sQLiteDatabase2 == null) {
                                                                    }
                                                                    i2++;
                                                                    r2 = z;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused) {
                                                                cursor3 = cursor;
                                                                z = z5;
                                                                SystemClock.sleep(i3);
                                                                i3 += 20;
                                                                if (cursor3 != null) {
                                                                }
                                                                if (sQLiteDatabase != null) {
                                                                }
                                                                i2++;
                                                                r2 = z;
                                                            }
                                                        }
                                                    } catch (SQLiteFullException e7) {
                                                        e = e7;
                                                        z5 = r2;
                                                    }
                                                }
                                                z5 = r2;
                                                z2 = true;
                                                sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                                sQLiteDatabase.setTransactionSuccessful();
                                                sQLiteDatabase.endTransaction();
                                                if (cursor != 0) {
                                                }
                                                sQLiteDatabase.close();
                                                return z2;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            z5 = r2;
                                            cursor3 = cursor;
                                            z = z5;
                                            SystemClock.sleep(i3);
                                            i3 += 20;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            i2++;
                                            r2 = z;
                                        } catch (SQLiteException e8) {
                                            e = e8;
                                            z3 = r2;
                                            z2 = true;
                                            z4 = z3;
                                            sQLiteDatabase2 = sQLiteDatabase;
                                            z = z4;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            j().G().b("Error writing entry to local database", e);
                                            this.d = z2;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase2 == null) {
                                            }
                                            i2++;
                                            r2 = z;
                                        }
                                    } catch (SQLiteFullException e9) {
                                        e = e9;
                                        z6 = r2;
                                        cursor4 = cursor;
                                        z = z6;
                                        j().G().b("Error writing entry; local database full", e);
                                        this.d = true;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                        r2 = z;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            j = 0;
                            if (j >= 100000) {
                            }
                            z5 = r2;
                            z2 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != 0) {
                            }
                            sQLiteDatabase.close();
                            return z2;
                        } catch (SQLiteFullException e10) {
                            e = e10;
                            z = r2;
                        } catch (SQLiteException e11) {
                            e = e11;
                            z4 = r2;
                            z2 = true;
                            cursor = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused3) {
                        z = r2;
                    }
                }
                z = r2;
            } catch (SQLiteDatabaseLockedException unused4) {
                z = r2;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e12) {
                e = e12;
                z = r2;
                sQLiteDatabase = null;
            } catch (SQLiteException e13) {
                e = e13;
                z = r2;
                z2 = true;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
            }
            SystemClock.sleep(i3);
            i3 += 20;
            if (cursor3 != null) {
                cursor3.close();
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            i2++;
            r2 = z;
        }
        boolean z7 = r2;
        j().K().a("Failed to write entry to local database");
        return z7;
    }

    public final boolean E(zzad zzadVar) {
        i();
        byte[] p0 = zznd.p0(zzadVar);
        if (p0.length > 131072) {
            j().I().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return D(2, p0);
    }

    public final boolean F(zzbg zzbgVar) {
        Parcel obtain = Parcel.obtain();
        zzbgVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            j().I().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return D(0, marshall);
    }

    public final boolean G(zznc zzncVar) {
        Parcel obtain = Parcel.obtain();
        zzncVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            j().I().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return D(1, marshall);
    }

    @InterfaceC10697xN2
    public final void H() {
        int delete;
        n();
        try {
            SQLiteDatabase K = K();
            if (K != null && (delete = K.delete("messages", null, null)) > 0) {
                j().K().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            j().G().b("Error resetting local analytics data. error", e);
        }
    }

    @InterfaceC10697xN2
    public final boolean I() {
        return D(3, new byte[0]);
    }

    @InterfaceC10697xN2
    public final boolean J() {
        n();
        if (this.d || !L()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase K = K();
                    if (K == null) {
                        this.d = true;
                        if (K != null) {
                            K.close();
                        }
                        return false;
                    }
                    K.beginTransaction();
                    K.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    K.setTransactionSuccessful();
                    K.endTransaction();
                    K.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    j().G().b("Error deleting app launch break from local database", e);
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e2) {
                j().G().b("Error deleting app launch break from local database", e2);
                this.d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        j().L().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final SQLiteDatabase K() throws SQLiteException {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase == null) {
            this.d = true;
            return null;
        }
        return writableDatabase;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfl p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfo q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziq r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkh s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkp t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzlx u() {
        return super.u();
    }
}
