package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbca;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzebg {
    public final zzbbt a;
    public final Context b;
    public final zzeal c;
    public final VersionInfoParcel d;

    public zzebg(Context context, VersionInfoParcel versionInfoParcel, zzbbt zzbbtVar, zzeal zzealVar) {
        this.b = context;
        this.d = versionInfoParcel;
        this.a = zzbbtVar;
        this.c = zzealVar;
    }

    public static /* synthetic */ Void a(zzebg zzebgVar, boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            zzebgVar.b.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbca.zzaf.zza.O3(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgzh e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.d("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.d(e.getMessage());
                }
            }
            query.close();
            Context context = zzebgVar.b;
            zzbca.zzaf.zzc m3 = zzbca.zzaf.m3();
            m3.u2(context.getPackageName());
            m3.x2(Build.MODEL);
            m3.Y1(zzeba.a(sQLiteDatabase, 0));
            m3.e2(arrayList);
            m3.c2(zzeba.a(sQLiteDatabase, 1));
            m3.w2(zzeba.a(sQLiteDatabase, 3));
            m3.d2(com.google.android.gms.ads.internal.zzv.d().a());
            int i2 = 2;
            m3.Z1(zzeba.b(sQLiteDatabase, 2));
            final zzbca.zzaf V1 = m3.V1();
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                zzbca.zzaf.zza zzaVar = (zzbca.zzaf.zza) arrayList.get(i3);
                if (zzaVar.k() == zzbca.zzq.ENUM_TRUE && zzaVar.d() > j) {
                    j = zzaVar.d();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbbt zzbbtVar = zzebgVar.a;
            zzbbtVar.b(new zzbbs() { // from class: com.google.android.gms.internal.ads.zzebe
                @Override // com.google.android.gms.internal.ads.zzbbs
                public final void a(zzbca.zzt.zza zzaVar2) {
                    zzaVar2.w2(zzbca.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = zzebgVar.d;
            zzbca.zzar.zza C2 = zzbca.zzar.C2();
            C2.b2(versionInfoParcel.Y);
            C2.d2(versionInfoParcel.Z);
            if (true == versionInfoParcel.Y0) {
                i2 = 0;
            }
            C2.c2(i2);
            final zzbca.zzar V12 = C2.V1();
            zzbbtVar.b(new zzbbs() { // from class: com.google.android.gms.internal.ads.zzebf
                @Override // com.google.android.gms.internal.ads.zzbbs
                public final void a(zzbca.zzt.zza zzaVar2) {
                    zzbca.zzm.zza s1 = zzaVar2.g().s1();
                    s1.u2(zzbca.zzar.this);
                    zzaVar2.j2(s1);
                }
            });
            zzbbtVar.c(10004);
            zzeba.e(sQLiteDatabase);
        }
        return null;
    }

    public final void b(final boolean z) {
        try {
            this.c.a(new zzffx() { // from class: com.google.android.gms.internal.ads.zzebd
                @Override // com.google.android.gms.internal.ads.zzffx
                public final Object b(Object obj) {
                    zzebg.a(zzebg.this, z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Error in offline signals database startup: ".concat(valueOf));
        }
    }
}
