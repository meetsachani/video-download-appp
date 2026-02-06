package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzebt extends zzfql {
    public final Context X;
    public final zzgdj Y;

    public zzebt(Context context, zzgdj zzgdjVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G8)).intValue(), zzfqn.a);
        this.X = context;
        this.Y = zzgdjVar;
    }

    public static /* synthetic */ Void a(zzebt zzebtVar, zzebv zzebvVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzebvVar.a));
        contentValues.put("gws_query_id", zzebvVar.b);
        contentValues.put("url", zzebvVar.c);
        contentValues.put("event_state", Integer.valueOf(zzebvVar.d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzv.v();
        Context context = zzebtVar.X;
        com.google.android.gms.ads.internal.util.zzbr a = com.google.android.gms.ads.internal.util.zzs.a(context);
        if (a != null) {
            try {
                a.zze(ObjectWrapper.V3(context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public static /* synthetic */ Void d(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        n(sQLiteDatabase, zzuVar);
        return null;
    }

    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        n(sQLiteDatabase, zzuVar);
    }

    public static final void m(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public static void n(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            Cursor query = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("timestamp");
                int columnIndex2 = query.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = query.getLong(columnIndex);
                    String string = query.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        Uri parse = Uri.parse(string);
                        String encodedQuery = parse.getEncodedQuery();
                        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                        clearQuery.appendQueryParameter("bd", Long.toString(com.google.android.gms.ads.internal.zzv.d().a() - j));
                        str = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
                    }
                    strArr[i] = str;
                }
                i++;
            }
            query.close();
            sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase2.setTransactionSuccessful();
            sQLiteDatabase2.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                zzuVar.w(strArr[i2]);
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            sQLiteDatabase2.endTransaction();
            throw th3;
        }
    }

    public final void f(final String str) {
        i(new zzffx(this) { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                zzebt.m((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void h(final zzebv zzebvVar) {
        i(new zzffx() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                zzebt.a(zzebt.this, zzebvVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void i(zzffx zzffxVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzebt.this.getWritableDatabase();
            }
        };
        zzgdj zzgdjVar = this.Y;
        zzgcy.r(zzgdjVar.I2(callable), new zzebs(this, zzffxVar), zzgdjVar);
    }

    public final void k(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // java.lang.Runnable
            public final void run() {
                zzebt.j(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void l(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        i(new zzffx() { // from class: com.google.android.gms.internal.ads.zzebo
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                zzebt.this.k((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
