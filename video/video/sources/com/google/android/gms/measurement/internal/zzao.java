package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.C2359d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.messaging.GmsRpc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C2531Be;
import o.C9811tl1;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzao extends zzmo {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
    public static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f310o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final zzau d;
    public final zzmi e;

    public zzao(zzmp zzmpVar) {
        super(zzmpVar);
        this.e = new zzmi(b());
        this.d = new zzau(this, a(), "google_app_measurement.db");
    }

    @InterfaceC10697xN2
    public static void T(ContentValues contentValues, String str, Object obj) {
        Preconditions.l(str);
        Preconditions.r(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @InterfaceC10697xN2
    public final long A() {
        return G("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle A0(String str) {
        Cursor cursor;
        Cursor cursor2;
        n();
        u();
        Cursor cursor3 = null;
        try {
            try {
                cursor = B().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
            } catch (SQLiteException e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (cursor3 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    j().K().a("Default event parameters not found");
                    cursor.close();
                    return null;
                }
                try {
                    zzfi.zze zzeVar = (zzfi.zze) ((com.google.android.gms.internal.measurement.zzix) ((zzfi.zze.zza) zzmz.F(zzfi.zze.Y(), cursor.getBlob(0))).e0());
                    o();
                    List<zzfi.zzg> c0 = zzeVar.c0();
                    Bundle bundle = new Bundle();
                    for (zzfi.zzg zzgVar : c0) {
                        String c02 = zzgVar.c0();
                        if (zzgVar.g0()) {
                            bundle.putDouble(c02, zzgVar.F());
                        } else if (zzgVar.h0()) {
                            bundle.putFloat(c02, zzgVar.Q());
                        } else if (zzgVar.k0()) {
                            bundle.putString(c02, zzgVar.d0());
                        } else if (zzgVar.i0()) {
                            bundle.putLong(c02, zzgVar.W());
                        }
                    }
                    cursor.close();
                    return bundle;
                } catch (IOException e2) {
                    j().G().c("Failed to retrieve default event parameters. appId", zzfr.v(str), e2);
                    cursor.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                j().G().b("Error selecting default event parameters", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor3 = cursor2;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final SQLiteDatabase B() {
        n();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            j().L().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzad B0(String str, String str2) {
        String str3;
        Cursor cursor;
        boolean z;
        Preconditions.l(str);
        Preconditions.l(str2);
        n();
        u();
        Cursor cursor2 = null;
        try {
            cursor = B().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.n, AppMeasurementSdk.ConditionalUserProperty.d, AppMeasurementSdk.ConditionalUserProperty.e, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.m, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.f309o, AppMeasurementSdk.ConditionalUserProperty.j, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object M = M(cursor, 1);
                    if (cursor.getInt(2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String string2 = cursor.getString(3);
                    long j2 = cursor.getLong(4);
                    zzmz o2 = o();
                    byte[] blob = cursor.getBlob(5);
                    Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                    zzbg zzbgVar = (zzbg) o2.C(blob, creator);
                    str3 = str2;
                    try {
                        zzad zzadVar = new zzad(str, str4, new zznc(str3, cursor.getLong(8), M, str4), cursor.getLong(6), z, string2, zzbgVar, j2, (zzbg) o().C(cursor.getBlob(7), creator), cursor.getLong(9), (zzbg) o().C(cursor.getBlob(10), creator));
                        if (cursor.moveToNext()) {
                            j().G().c("Got multiple records for conditional property, expected one", zzfr.v(str), g().g(str3));
                        }
                        cursor.close();
                        return zzadVar;
                    } catch (SQLiteException e) {
                        e = e;
                        j().G().d("Error querying conditional property", zzfr.v(str), g().g(str3), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String C() {
        Throwable th;
        Cursor cursor;
        ?? B = B();
        try {
            try {
                cursor = B.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            } catch (SQLiteException e) {
                e = e;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                B = 0;
                if (B != 0) {
                }
                throw th;
            }
            try {
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                j().G().b("Database error getting next bundle app id", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            if (B != 0) {
                B.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbc C0(String str, String str2) {
        Cursor cursor;
        boolean z;
        long j2;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Boolean bool;
        Preconditions.l(str);
        Preconditions.l(str2);
        n();
        u();
        Cursor cursor2 = null;
        try {
            try {
                z = false;
                cursor = B().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (SQLiteException e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                long j3 = cursor.getLong(0);
                long j4 = cursor.getLong(1);
                long j5 = cursor.getLong(2);
                long j6 = 0;
                if (cursor.isNull(3)) {
                    j2 = 0;
                } else {
                    j2 = cursor.getLong(3);
                }
                if (cursor.isNull(4)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(cursor.getLong(4));
                }
                if (cursor.isNull(5)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(cursor.getLong(5));
                }
                if (cursor.isNull(6)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(cursor.getLong(6));
                }
                if (!cursor.isNull(7)) {
                    if (cursor.getLong(7) == 1) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                if (!cursor.isNull(8)) {
                    j6 = cursor.getLong(8);
                }
                zzbc zzbcVar = new zzbc(str, str2, j3, j4, j6, j5, j2, valueOf, valueOf2, valueOf3, bool);
                if (cursor.moveToNext()) {
                    j().G().b("Got multiple records for event aggregates, expected one. appId", zzfr.v(str));
                }
                cursor.close();
                return zzbcVar;
            } catch (SQLiteException e2) {
                e = e2;
                j().G().d("Error querying events. appId", zzfr.v(str), g().c(str2), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = "current_bundle_count";
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final int D(String str, String str2) {
        Preconditions.l(str);
        Preconditions.l(str2);
        n();
        u();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            j().G().d("Error deleting conditional property", zzfr.v(str), g().g(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132 A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187 A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0196 A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ae A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d5 A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020d A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0231 A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257 A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026d A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0284 A[Catch: all -> 0x00e5, SQLiteException -> 0x00e9, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x00e9, blocks: (B:10:0x0079, B:12:0x00dc, B:21:0x00ed, B:25:0x0137, B:27:0x0166, B:32:0x0170, B:36:0x018b, B:38:0x0196, B:39:0x01a8, B:41:0x01ae, B:43:0x01ba, B:45:0x01c6, B:46:0x01cf, B:48:0x01d5, B:50:0x01e1, B:52:0x01e9, B:56:0x01f2, B:57:0x01f5, B:59:0x020d, B:61:0x0219, B:62:0x022b, B:64:0x0231, B:66:0x023d, B:68:0x0245, B:72:0x024e, B:73:0x0251, B:75:0x0257, B:77:0x0263, B:84:0x0278, B:80:0x026d, B:83:0x0274, B:85:0x027b, B:87:0x0284, B:35:0x0187, B:24:0x0132), top: B:105:0x0079 }] */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh D0(String str) {
        zzao zzaoVar;
        Cursor cursor;
        boolean z;
        long j2;
        boolean z2;
        long j3;
        Boolean valueOf;
        boolean z3;
        boolean z4;
        Preconditions.l(str);
        n();
        u();
        Cursor cursor2 = null;
        try {
            cursor = B().query("apps", new String[]{"app_instance_id", GmsRpc.A, "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                zzaoVar = this;
                try {
                    try {
                        zzh zzhVar = new zzh(zzaoVar.b.i0(), str);
                        boolean z5 = false;
                        zzhVar.x(cursor.getString(0));
                        zzhVar.M(cursor.getString(1));
                        zzhVar.S(cursor.getString(2));
                        zzhVar.h0(cursor.getLong(3));
                        zzhVar.j0(cursor.getLong(4));
                        zzhVar.f0(cursor.getLong(5));
                        zzhVar.F(cursor.getString(6));
                        zzhVar.B(cursor.getString(7));
                        zzhVar.d0(cursor.getLong(8));
                        zzhVar.X(cursor.getLong(9));
                        if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                            z = false;
                            zzhVar.y(z);
                            zzhVar.U(cursor.getLong(11));
                            zzhVar.O(cursor.getLong(12));
                            zzhVar.L(cursor.getLong(13));
                            zzhVar.E(cursor.getLong(14));
                            zzhVar.A(cursor.getLong(15));
                            zzhVar.b0(cursor.getLong(16));
                            if (!cursor.isNull(17)) {
                                j2 = -2147483648L;
                            } else {
                                j2 = cursor.getInt(17);
                            }
                            zzhVar.c(j2);
                            zzhVar.J(cursor.getString(18));
                            zzhVar.I(cursor.getLong(19));
                            zzhVar.R(cursor.getLong(20));
                            zzhVar.P(cursor.getString(21));
                            if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                                z2 = false;
                                zzhVar.g(z2);
                                zzhVar.e(cursor.getString(24));
                                if (!cursor.isNull(25)) {
                                    j3 = 0;
                                } else {
                                    j3 = cursor.getLong(25);
                                }
                                zzhVar.Z(j3);
                                if (!cursor.isNull(26)) {
                                    zzhVar.f(Arrays.asList(cursor.getString(26).split(",", -1)));
                                }
                                if (zzps.a() && (zzaoVar.d().B(str, zzbi.y0) || zzaoVar.d().s(zzbi.w0))) {
                                    zzhVar.V(cursor.getString(28));
                                }
                                if (zzqd.a() && zzaoVar.d().s(zzbi.A0)) {
                                    if (cursor.isNull(29) && cursor.getInt(29) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    zzhVar.C(z4);
                                }
                                zzhVar.n0(cursor.getLong(30));
                                zzhVar.l0(cursor.getLong(31));
                                if (zzpg.a() && zzaoVar.d().B(str, zzbi.L0)) {
                                    zzhVar.b(cursor.getInt(32));
                                    zzhVar.w(cursor.getLong(35));
                                }
                                if (zznk.a() && zzaoVar.d().B(str, zzbi.Y0)) {
                                    if (cursor.isNull(33) && cursor.getInt(33) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    zzhVar.G(z3);
                                }
                                if (zznp.a() && zzaoVar.d().B(str, zzbi.T0)) {
                                    if (!cursor.isNull(34)) {
                                        valueOf = null;
                                    } else {
                                        if (cursor.getInt(34) != 0) {
                                            z5 = true;
                                        }
                                        valueOf = Boolean.valueOf(z5);
                                    }
                                    zzhVar.d(valueOf);
                                }
                                zzhVar.o();
                                if (cursor.moveToNext()) {
                                    zzaoVar.j().G().b("Got multiple records for app, expected one. appId", zzfr.v(str));
                                }
                                cursor.close();
                                return zzhVar;
                            }
                            z2 = true;
                            zzhVar.g(z2);
                            zzhVar.e(cursor.getString(24));
                            if (!cursor.isNull(25)) {
                            }
                            zzhVar.Z(j3);
                            if (!cursor.isNull(26)) {
                            }
                            if (zzps.a()) {
                                zzhVar.V(cursor.getString(28));
                            }
                            if (zzqd.a()) {
                                if (cursor.isNull(29)) {
                                }
                                z4 = false;
                                zzhVar.C(z4);
                            }
                            zzhVar.n0(cursor.getLong(30));
                            zzhVar.l0(cursor.getLong(31));
                            if (zzpg.a()) {
                                zzhVar.b(cursor.getInt(32));
                                zzhVar.w(cursor.getLong(35));
                            }
                            if (zznk.a()) {
                                if (cursor.isNull(33)) {
                                }
                                z3 = false;
                                zzhVar.G(z3);
                            }
                            if (zznp.a()) {
                                if (!cursor.isNull(34)) {
                                }
                                zzhVar.d(valueOf);
                            }
                            zzhVar.o();
                            if (cursor.moveToNext()) {
                            }
                            cursor.close();
                            return zzhVar;
                        }
                        z = true;
                        zzhVar.y(z);
                        zzhVar.U(cursor.getLong(11));
                        zzhVar.O(cursor.getLong(12));
                        zzhVar.L(cursor.getLong(13));
                        zzhVar.E(cursor.getLong(14));
                        zzhVar.A(cursor.getLong(15));
                        zzhVar.b0(cursor.getLong(16));
                        if (!cursor.isNull(17)) {
                        }
                        zzhVar.c(j2);
                        zzhVar.J(cursor.getString(18));
                        zzhVar.I(cursor.getLong(19));
                        zzhVar.R(cursor.getLong(20));
                        zzhVar.P(cursor.getString(21));
                        if (!cursor.isNull(23)) {
                            z2 = false;
                            zzhVar.g(z2);
                            zzhVar.e(cursor.getString(24));
                            if (!cursor.isNull(25)) {
                            }
                            zzhVar.Z(j3);
                            if (!cursor.isNull(26)) {
                            }
                            if (zzps.a()) {
                            }
                            if (zzqd.a()) {
                            }
                            zzhVar.n0(cursor.getLong(30));
                            zzhVar.l0(cursor.getLong(31));
                            if (zzpg.a()) {
                            }
                            if (zznk.a()) {
                            }
                            if (zznp.a()) {
                            }
                            zzhVar.o();
                            if (cursor.moveToNext()) {
                            }
                            cursor.close();
                            return zzhVar;
                        }
                        z2 = true;
                        zzhVar.g(z2);
                        zzhVar.e(cursor.getString(24));
                        if (!cursor.isNull(25)) {
                        }
                        zzhVar.Z(j3);
                        if (!cursor.isNull(26)) {
                        }
                        if (zzps.a()) {
                        }
                        if (zzqd.a()) {
                        }
                        zzhVar.n0(cursor.getLong(30));
                        zzhVar.l0(cursor.getLong(31));
                        if (zzpg.a()) {
                        }
                        if (zznk.a()) {
                        }
                        if (zznp.a()) {
                        }
                        zzhVar.o();
                        if (cursor.moveToNext()) {
                        }
                        cursor.close();
                        return zzhVar;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    zzaoVar.j().G().c("Error querying app. appId", zzfr.v(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                zzaoVar = this;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            zzaoVar = this;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final long E(zzfi.zzj zzjVar) throws IOException {
        n();
        u();
        Preconditions.r(zzjVar);
        Preconditions.l(zzjVar.H3());
        byte[] k2 = zzjVar.k();
        long A = o().A(k2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjVar.H3());
        contentValues.put("metadata_fingerprint", Long.valueOf(A));
        contentValues.put("metadata", k2);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return A;
        } catch (SQLiteException e) {
            j().G().c("Error storing raw event metadata. appId", zzfr.v(zzjVar.H3()), e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaq E0(String str) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Preconditions.l(str);
        n();
        u();
        Cursor cursor3 = null;
        try {
            try {
                cursor = B().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            } catch (SQLiteException e) {
                e = e;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor3 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                byte[] blob = cursor.getBlob(0);
                String string = cursor.getString(1);
                String string2 = cursor.getString(2);
                if (cursor.moveToNext()) {
                    j().G().b("Got multiple records for app config, expected one. appId", zzfr.v(str));
                }
                if (blob == null) {
                    cursor.close();
                    return null;
                }
                zzaq zzaqVar = new zzaq(blob, string, string2);
                cursor.close();
                return zzaqVar;
            } catch (SQLiteException e2) {
                e = e2;
                j().G().c("Error querying remote config. appId", zzfr.v(str), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor3 = cursor2;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    public final long F(String str) {
        Preconditions.l(str);
        n();
        u();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, d().u(str, zzbi.r))))});
        } catch (SQLiteException e) {
            j().G().c("Error deleting over the limit events. appId", zzfr.v(str), e);
            return 0L;
        }
    }

    @InterfaceC10697xN2
    public final zzne F0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        Preconditions.l(str);
        Preconditions.l(str2);
        n();
        u();
        Cursor cursor2 = null;
        try {
            cursor = B().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j2 = cursor.getLong(0);
                    Object M = M(cursor, 1);
                    if (M == null) {
                        cursor.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zzne zzneVar = new zzne(str3, cursor.getString(2), str4, j2, M);
                        if (cursor.moveToNext()) {
                            j().G().b("Got multiple records for user property, expected one. appId", zzfr.v(str3));
                        }
                        cursor.close();
                        return zzneVar;
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteException = e;
                        j().G().d("Error querying user property. appId", zzfr.v(str3), g().g(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @InterfaceC10697xN2
    public final long G(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j3 = cursor.getLong(0);
                    cursor.close();
                    return j3;
                }
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                j().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzay G0(String str) {
        if (zznp.a() && d().s(zzbi.T0)) {
            Preconditions.r(str);
            n();
            u();
            return zzay.c(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
        }
        return zzay.f;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<zzfi.zze, Long> H(String str, Long l2) {
        Cursor cursor;
        Cursor cursor2;
        n();
        u();
        Cursor cursor3 = null;
        try {
            try {
                cursor = B().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l2)});
            } catch (SQLiteException e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (cursor3 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    j().K().a("Main event not found");
                    cursor.close();
                    return null;
                }
                try {
                    Pair<zzfi.zze, Long> create = Pair.create((zzfi.zze) ((com.google.android.gms.internal.measurement.zzix) ((zzfi.zze.zza) zzmz.F(zzfi.zze.Y(), cursor.getBlob(0))).e0()), Long.valueOf(cursor.getLong(1)));
                    cursor.close();
                    return create;
                } catch (IOException e2) {
                    j().G().d("Failed to merge main event. appId, eventId", zzfr.v(str), l2, e2);
                    cursor.close();
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                j().G().b("Error selecting main event", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor3 = cursor2;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<zzew.zzb>> H0(String str, String str2) {
        u();
        n();
        Preconditions.l(str);
        Preconditions.l(str2);
        C2531Be c2531Be = new C2531Be();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zzb>> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                do {
                    try {
                        zzew.zzb zzbVar = (zzew.zzb) ((com.google.android.gms.internal.measurement.zzix) ((zzew.zzb.zza) zzmz.F(zzew.zzb.L(), query.getBlob(1))).e0());
                        int i2 = query.getInt(0);
                        List list = (List) c2531Be.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            c2531Be.put(Integer.valueOf(i2), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e) {
                        j().G().c("Failed to merge filter. appId", zzfr.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return c2531Be;
            } catch (SQLiteException e2) {
                j().G().c("Database error querying filters. appId", zzfr.v(str), e2);
                Map<Integer, List<zzew.zzb>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final zzap I(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.l(str);
        n();
        u();
        String[] strArr = {str};
        zzap zzapVar = new zzap();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase B = B();
                Cursor query = B.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    j().L().b("Not updating daily counts, app is not known. appId", zzfr.v(str));
                    query.close();
                    return zzapVar;
                }
                if (query.getLong(0) == j2) {
                    zzapVar.b = query.getLong(1);
                    zzapVar.a = query.getLong(2);
                    zzapVar.c = query.getLong(3);
                    zzapVar.d = query.getLong(4);
                    zzapVar.e = query.getLong(5);
                }
                if (z) {
                    zzapVar.b += j3;
                }
                if (z2) {
                    zzapVar.a += j3;
                }
                if (z3) {
                    zzapVar.c += j3;
                }
                if (z4) {
                    zzapVar.d += j3;
                }
                if (z5) {
                    zzapVar.e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(zzapVar.a));
                contentValues.put("daily_events_count", Long.valueOf(zzapVar.b));
                contentValues.put("daily_conversions_count", Long.valueOf(zzapVar.c));
                contentValues.put("daily_error_events_count", Long.valueOf(zzapVar.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzapVar.e));
                B.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzapVar;
            } catch (SQLiteException e) {
                j().G().c("Error updating daily counts. appId", zzfr.v(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return zzapVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final zzih I0(String str) {
        Preconditions.r(str);
        n();
        u();
        if (zznp.a() && d().s(zzbi.T0)) {
            zzih zzihVar = (zzih) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzar() { // from class: com.google.android.gms.measurement.internal.zzan
                @Override // com.google.android.gms.measurement.internal.zzar
                public final Object a(Cursor cursor) {
                    zzih f2;
                    f2 = zzih.f(cursor.getString(0), cursor.getInt(1));
                    return f2;
                }
            });
            if (zzihVar == null) {
                return zzih.c;
            }
            return zzihVar;
        }
        return zzih.e(P("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    @InterfaceC10697xN2
    public final zzap J(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return I(j2, str, 1L, false, false, z3, false, z5);
    }

    public final Map<Integer, List<zzew.zze>> J0(String str, String str2) {
        u();
        n();
        Preconditions.l(str);
        Preconditions.l(str2);
        C2531Be c2531Be = new C2531Be();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zze>> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                do {
                    try {
                        zzew.zze zzeVar = (zzew.zze) ((com.google.android.gms.internal.measurement.zzix) ((zzew.zze.zza) zzmz.F(zzew.zze.I(), query.getBlob(1))).e0());
                        int i2 = query.getInt(0);
                        List list = (List) c2531Be.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            c2531Be.put(Integer.valueOf(i2), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e) {
                        j().G().c("Failed to merge filter", zzfr.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return c2531Be;
            } catch (SQLiteException e2) {
                j().G().c("Database error querying filters. appId", zzfr.v(str), e2);
                Map<Integer, List<zzew.zze>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzmh> K0(String str) {
        Preconditions.l(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzmh(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                j().G().c("Error querying trigger uris. appId", zzfr.v(str), e);
                List<zzmh> list = Collections.EMPTY_LIST;
                if (cursor != null) {
                    cursor.close();
                }
                return list;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final void L0(String str, String str2) {
        Preconditions.l(str);
        Preconditions.l(str2);
        n();
        u();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            j().G().d("Error deleting user property. appId", zzfr.v(str), g().g(str2), e);
        }
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final Object M(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            j().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        j().G().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i2);
                }
                return Double.valueOf(cursor.getDouble(i2));
            }
            return Long.valueOf(cursor.getLong(i2));
        }
        j().G().a("Loaded invalid null value from database");
        return null;
    }

    @InterfaceC10697xN2
    public final List<zzne> M0(String str) {
        String str2;
        Preconditions.l(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j2 = cursor.getLong(2);
                    Object M = M(cursor, 3);
                    if (M == null) {
                        j().G().b("Read invalid user property value, ignoring it. appId", zzfr.v(str));
                        str2 = str;
                    } else {
                        str2 = str;
                        try {
                            arrayList.add(new zzne(str2, str3, string, j2, M));
                        } catch (SQLiteException e) {
                            e = e;
                            j().G().c("Error querying user properties. appId", zzfr.v(str2), e);
                            List<zzne> list = Collections.EMPTY_LIST;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return list;
                        }
                    }
                    if (!cursor.moveToNext()) {
                        cursor.close();
                        return arrayList;
                    }
                    str = str2;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str2 = str;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T N(String str, String[] strArr, zzar<T> zzarVar) {
        Cursor cursor;
        ?? r0 = 0;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
            } catch (SQLiteException e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (r0 != 0) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    j().K().a("No data found");
                    cursor.close();
                    return null;
                }
                T a = zzarVar.a(cursor);
                cursor.close();
                return a;
            } catch (SQLiteException e2) {
                e = e2;
                j().G().b("Error querying database.", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = str;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    public final Map<Integer, zzfi.zzl> N0(String str) {
        u();
        n();
        Preconditions.l(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfi.zzl> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                C2531Be c2531Be = new C2531Be();
                do {
                    int i2 = query.getInt(0);
                    try {
                        c2531Be.put(Integer.valueOf(i2), (zzfi.zzl) ((com.google.android.gms.internal.measurement.zzix) ((zzfi.zzl.zza) zzmz.F(zzfi.zzl.U(), query.getBlob(1))).e0()));
                    } catch (IOException e) {
                        j().G().d("Failed to merge filter results. appId, audienceId, error", zzfr.v(str), Integer.valueOf(i2), e);
                    }
                } while (query.moveToNext());
                query.close();
                return c2531Be;
            } catch (SQLiteException e2) {
                j().G().c("Database error querying filter results. appId", zzfr.v(str), e2);
                Map<Integer, zzfi.zzl> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String O(long j2) {
        Cursor cursor;
        n();
        u();
        Cursor cursor2 = null;
        try {
            try {
                cursor = B().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j2)});
            } catch (SQLiteException e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    j().K().a("No expired configs for apps with pending events");
                    cursor.close();
                    return null;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e2) {
                e = e2;
                j().G().b("Error selecting expired configs", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = j2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<zzew.zzb>> O0(String str) {
        Preconditions.l(str);
        C2531Be c2531Be = new C2531Be();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zzb>> map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                do {
                    try {
                        zzew.zzb zzbVar = (zzew.zzb) ((com.google.android.gms.internal.measurement.zzix) ((zzew.zzb.zza) zzmz.F(zzew.zzb.L(), query.getBlob(1))).e0());
                        if (zzbVar.T()) {
                            int i2 = query.getInt(0);
                            List list = (List) c2531Be.get(Integer.valueOf(i2));
                            if (list == null) {
                                list = new ArrayList();
                                c2531Be.put(Integer.valueOf(i2), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        j().G().c("Failed to merge filter. appId", zzfr.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return c2531Be;
            } catch (SQLiteException e2) {
                j().G().c("Database error querying filters. appId", zzfr.v(str), e2);
                Map<Integer, List<zzew.zzb>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final String P(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return str2;
            } catch (SQLiteException e) {
                j().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map<Integer, List<Integer>> P0(String str) {
        u();
        n();
        Preconditions.l(str);
        C2531Be c2531Be = new C2531Be();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> map = Collections.EMPTY_MAP;
                    rawQuery.close();
                    return map;
                }
                do {
                    int i2 = rawQuery.getInt(0);
                    List list = (List) c2531Be.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        c2531Be.put(Integer.valueOf(i2), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return c2531Be;
            } catch (SQLiteException e) {
                j().G().c("Database error querying scoped filters. appId", zzfr.v(str), e);
                Map<Integer, List<Integer>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final List<Pair<zzfi.zzj, Long>> Q(String str, int i2, int i3) {
        boolean z;
        boolean z2;
        byte[] i0;
        long j2;
        long j3;
        n();
        u();
        int i4 = 1;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z);
        if (i3 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.a(z2);
        Preconditions.l(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!query.moveToFirst()) {
                    List<Pair<zzfi.zzj, Long>> list = Collections.EMPTY_LIST;
                    query.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (true) {
                    long j4 = query.getLong(0);
                    try {
                        i0 = o().i0(query.getBlob(i4));
                    } catch (IOException e) {
                        j().G().c("Failed to unzip queued bundle. appId", zzfr.v(str), e);
                    }
                    if (!arrayList.isEmpty() && i0.length + i5 > i3) {
                        break;
                    }
                    try {
                        zzfi.zzj.zza zzaVar = (zzfi.zzj.zza) zzmz.F(zzfi.zzj.E3(), i0);
                        if (zznp.a() && d().s(zzbi.X0) && !arrayList.isEmpty()) {
                            zzfi.zzj zzjVar = (zzfi.zzj) ((Pair) arrayList.get(0)).first;
                            zzfi.zzj zzjVar2 = (zzfi.zzj) ((com.google.android.gms.internal.measurement.zzix) zzaVar.e0());
                            if (!zzjVar.g0().equals(zzjVar2.g0()) || !zzjVar.f0().equals(zzjVar2.f0()) || zzjVar.w0() != zzjVar2.w0() || !zzjVar.h0().equals(zzjVar2.h0())) {
                                break;
                            }
                            Iterator<zzfi.zzn> it = zzjVar.u0().iterator();
                            while (true) {
                                j2 = -1;
                                if (it.hasNext()) {
                                    zzfi.zzn next = it.next();
                                    if ("_npa".equals(next.Y())) {
                                        j3 = next.T();
                                        break;
                                    }
                                } else {
                                    j3 = -1;
                                    break;
                                }
                            }
                            Iterator<zzfi.zzn> it2 = zzjVar2.u0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfi.zzn next2 = it2.next();
                                if ("_npa".equals(next2.Y())) {
                                    j2 = next2.T();
                                    break;
                                }
                            }
                            if (j3 != j2) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            zzaVar.r0(query.getInt(2));
                        }
                        i5 += i0.length;
                        arrayList.add(Pair.create((zzfi.zzj) ((com.google.android.gms.internal.measurement.zzix) zzaVar.e0()), Long.valueOf(j4)));
                    } catch (IOException e2) {
                        j().G().c("Failed to merge queued bundle. appId", zzfr.v(str), e2);
                    }
                    if (!query.moveToNext() || i5 > i3) {
                        break;
                    }
                    i4 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e3) {
                j().G().c("Error querying bundles. appId", zzfr.v(str), e3);
                List<Pair<zzfi.zzj, Long>> list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final void Q0() {
        u();
        B().beginTransaction();
    }

    @InterfaceC10697xN2
    public final List<zzad> R(String str, String str2, String str3) {
        Preconditions.l(str);
        n();
        u();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @InterfaceC10697xN2
    public final void R0() {
        u();
        B().endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        j().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzad> S(String str, String[] strArr) {
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.n, AppMeasurementSdk.ConditionalUserProperty.d, AppMeasurementSdk.ConditionalUserProperty.e, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.m, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.f309o, AppMeasurementSdk.ConditionalUserProperty.j, "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() < 1000) {
                        boolean z = false;
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object M = M(cursor, 3);
                        if (cursor.getInt(4) != 0) {
                            z = true;
                        }
                        String string4 = cursor.getString(5);
                        long j2 = cursor.getLong(6);
                        zzmz o2 = o();
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) o2.C(blob, creator);
                        arrayList.add(new zzad(string, string2, new zznc(string3, cursor.getLong(10), M, string2), cursor.getLong(8), z, string4, zzbgVar, j2, (zzbg) o().C(cursor.getBlob(9), creator), cursor.getLong(11), (zzbg) o().C(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                j().G().b("Error querying conditional user property value", e);
                List<zzad> list = Collections.EMPTY_LIST;
                if (cursor != null) {
                    cursor.close();
                }
                return list;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @InterfaceC10697xN2
    public final void S0() {
        int delete;
        n();
        u();
        if (u0()) {
            long a = s().e.a();
            long b = b().b();
            if (Math.abs(b - a) > zzbi.A.a(null).longValue()) {
                s().e.b(b);
                n();
                u();
                if (u0() && (delete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(zzaf.M())})) > 0) {
                    j().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    @InterfaceC10697xN2
    public final void T0() {
        u();
        B().setTransactionSuccessful();
    }

    @InterfaceC10697xN2
    public final void U(zzbc zzbcVar) {
        Long l2;
        Preconditions.r(zzbcVar);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.a);
        contentValues.put("name", zzbcVar.b);
        contentValues.put("lifetime_count", Long.valueOf(zzbcVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(zzbcVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbcVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbcVar.g));
        contentValues.put("last_bundled_day", zzbcVar.h);
        contentValues.put("last_sampled_complex_event_id", zzbcVar.i);
        contentValues.put("last_sampling_rate", zzbcVar.j);
        contentValues.put("current_session_count", Long.valueOf(zzbcVar.e));
        Boolean bool = zzbcVar.k;
        if (bool != null && bool.booleanValue()) {
            l2 = 1L;
        } else {
            l2 = null;
        }
        contentValues.put("last_exempt_from_sampling", l2);
        try {
            if (B().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update event aggregates (got -1). appId", zzfr.v(zzbcVar.a));
            }
        } catch (SQLiteException e) {
            j().G().c("Error storing event aggregates. appId", zzfr.v(zzbcVar.a), e);
        }
    }

    public final boolean U0() {
        if (x0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    @InterfaceC10697xN2
    public final void V(zzh zzhVar) {
        Preconditions.r(zzhVar);
        n();
        u();
        String t0 = zzhVar.t0();
        Preconditions.r(t0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t0);
        contentValues.put("app_instance_id", zzhVar.u0());
        contentValues.put(GmsRpc.A, zzhVar.j());
        contentValues.put("resettable_device_id_hash", zzhVar.l());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.i0()));
        contentValues.put("app_version", zzhVar.h());
        contentValues.put("app_store", zzhVar.v0());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.r()));
        contentValues.put("day", Long.valueOf(zzhVar.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.T()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.K()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.e0()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.z()));
        contentValues.put("firebase_instance_id", zzhVar.i());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.W()));
        contentValues.put("health_monitor_sample", zzhVar.k());
        contentValues.put("android_id", Long.valueOf(zzhVar.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.q()));
        contentValues.put("admob_app_id", zzhVar.r0());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.c0()));
        contentValues.put("session_stitching_token", zzhVar.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.t()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.o0()));
        if (zzpg.a() && d().B(t0, zzbi.L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.D()));
        }
        if (zznk.a() && d().B(t0, zzbi.Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.u()));
        }
        List<String> n2 = zzhVar.n();
        if (n2 != null) {
            if (n2.isEmpty()) {
                j().L().b("Safelisted events should not be an empty list. appId", t0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", n2));
            }
        }
        if (zznq.a() && d().s(zzbi.u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zznp.a() && d().B(t0, zzbi.T0)) {
            contentValues.put("npa_metadata_value", zzhVar.q0());
        }
        try {
            SQLiteDatabase B = B();
            if (B.update("apps", contentValues, "app_id = ?", new String[]{t0}) == 0 && B.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update app (got -1). appId", zzfr.v(t0));
            }
        } catch (SQLiteException e) {
            j().G().c("Error storing app. appId", zzfr.v(t0), e);
        }
    }

    public final boolean V0() {
        if (x0("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final void W(String str, zzay zzayVar) {
        if (zznp.a() && d().s(zzbi.T0)) {
            Preconditions.r(str);
            Preconditions.r(zzayVar);
            n();
            u();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", zzayVar.i());
            Y("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean W0() {
        if (x0("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final void X(String str, zzih zzihVar) {
        Preconditions.r(str);
        Preconditions.r(zzihVar);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzihVar.v());
        if (zznp.a() && d().s(zzbi.T0)) {
            contentValues.put("consent_source", Integer.valueOf(zzihVar.b()));
            Y("consent_settings", "app_id", contentValues);
            return;
        }
        try {
            if (B().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update consent setting (got -1). appId", zzfr.v(str));
            }
        } catch (SQLiteException e) {
            j().G().c("Error storing consent setting. appId, error", zzfr.v(str), e);
        }
    }

    @InterfaceC10697xN2
    public final void Y(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase B = B();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                j().H().b("Value of the primary key is not set.", zzfr.v(str2));
                return;
            }
            if (B.update(str, contentValues, str2 + " = ?", new String[]{asString}) == 0 && B.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                j().G().c("Failed to insert/update table (got -1). key", zzfr.v(str), zzfr.v(str2));
            }
        } catch (SQLiteException e) {
            j().G().d("Error storing into table. key", zzfr.v(str), zzfr.v(str2), e);
        }
    }

    @InterfaceC10697xN2
    public final void Z(String str, List<zzew.zza> list) {
        Integer num;
        boolean z;
        boolean z2;
        Preconditions.r(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzew.zza.C0110zza x = list.get(i2).x();
            if (x.v() != 0) {
                for (int i3 = 0; i3 < x.v(); i3++) {
                    zzew.zzb.zza x2 = x.y(i3).x();
                    zzew.zzb.zza zzaVar = (zzew.zzb.zza) ((zzix.zzb) x2.clone());
                    String b = zzii.b(x2.z());
                    if (b != null) {
                        zzaVar.x(b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < x2.v(); i4++) {
                        zzew.zzc y = x2.y(i4);
                        String a = zzik.a(y.L());
                        if (a != null) {
                            zzaVar.w(i4, (zzew.zzc) ((com.google.android.gms.internal.measurement.zzix) y.x().v(a).e0()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzew.zza.C0110zza w = x.w(i3, zzaVar);
                        list.set(i2, (zzew.zza) ((com.google.android.gms.internal.measurement.zzix) w.e0()));
                        x = w;
                    }
                }
            }
            if (x.z() != 0) {
                for (int i5 = 0; i5 < x.z(); i5++) {
                    zzew.zze A = x.A(i5);
                    String a2 = zzij.a(A.K());
                    if (a2 != null) {
                        x = x.x(i5, A.x().v(a2));
                        list.set(i2, (zzew.zza) ((com.google.android.gms.internal.measurement.zzix) x.e0()));
                    }
                }
            }
        }
        u();
        n();
        Preconditions.l(str);
        Preconditions.r(list);
        SQLiteDatabase B = B();
        B.beginTransaction();
        try {
            u();
            n();
            Preconditions.l(str);
            SQLiteDatabase B2 = B();
            B2.delete("property_filters", "app_id=?", new String[]{str});
            B2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzew.zza zzaVar2 : list) {
                u();
                n();
                Preconditions.l(str);
                Preconditions.r(zzaVar2);
                if (!zzaVar2.Q()) {
                    j().L().b("Audience with no ID. appId", zzfr.v(str));
                } else {
                    int m2 = zzaVar2.m();
                    Iterator<zzew.zzb> it = zzaVar2.O().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().U()) {
                                j().L().c("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfr.v(str), Integer.valueOf(m2));
                                break;
                            }
                        } else {
                            Iterator<zzew.zze> it2 = zzaVar2.P().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().O()) {
                                        j().L().c("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfr.v(str), Integer.valueOf(m2));
                                        break;
                                    }
                                } else {
                                    Iterator<zzew.zzb> it3 = zzaVar2.O().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!f0(str, m2, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzew.zze> it4 = zzaVar2.P().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!g0(str, m2, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        u();
                                        n();
                                        Preconditions.l(str);
                                        SQLiteDatabase B3 = B();
                                        B3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(m2)});
                                        B3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(m2)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzew.zza zzaVar3 : list) {
                if (zzaVar3.Q()) {
                    num = Integer.valueOf(zzaVar3.m());
                } else {
                    num = null;
                }
                arrayList.add(num);
            }
            z0(str, arrayList);
            B.setTransactionSuccessful();
            B.endTransaction();
        } catch (Throwable th) {
            B.endTransaction();
            throw th;
        }
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final void a0(List<Long> list) {
        n();
        u();
        Preconditions.r(list);
        Preconditions.t(list.size());
        if (!u0()) {
            return;
        }
        String str = C9811tl1.c + TextUtils.join(",", list) + C9811tl1.d;
        if (x0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            j().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e) {
            j().G().b("Error incrementing retry count. error", e);
        }
    }

    @InterfaceC10697xN2
    public final boolean b0(zzfi.zzj zzjVar, boolean z) {
        n();
        u();
        Preconditions.r(zzjVar);
        Preconditions.l(zzjVar.H3());
        Preconditions.x(zzjVar.W0());
        S0();
        long a = b().a();
        if (zzjVar.b3() < a - zzaf.M() || zzjVar.b3() > zzaf.M() + a) {
            j().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfr.v(zzjVar.H3()), Long.valueOf(a), Long.valueOf(zzjVar.b3()));
        }
        try {
            byte[] g0 = o().g0(zzjVar.k());
            j().K().b("Saving bundle, size", Integer.valueOf(g0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzjVar.H3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzjVar.b3()));
            contentValues.put("data", g0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzjVar.d1()) {
                contentValues.put("retry_count", Integer.valueOf(zzjVar.i2()));
            }
            try {
                if (B().insert("queue", null, contentValues) == -1) {
                    j().G().b("Failed to insert bundle (got -1). appId", zzfr.v(zzjVar.H3()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                j().G().c("Error storing bundle. appId", zzfr.v(zzjVar.H3()), e);
                return false;
            }
        } catch (IOException e2) {
            j().G().c("Data loss. Failed to serialize bundle. appId", zzfr.v(zzjVar.H3()), e2);
            return false;
        }
    }

    @InterfaceC10697xN2
    public final boolean c0(zzad zzadVar) {
        Preconditions.r(zzadVar);
        n();
        u();
        String str = zzadVar.X;
        Preconditions.r(str);
        if (F0(str, zzadVar.Z.Y) == null && x0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzadVar.Y);
        contentValues.put("name", zzadVar.Z.Y);
        T(contentValues, "value", Preconditions.r(zzadVar.Z.m0()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.n, Boolean.valueOf(zzadVar.Z0));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.d, zzadVar.a1);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.e, Long.valueOf(zzadVar.c1));
        i();
        contentValues.put("timed_out_event", zznd.p0(zzadVar.b1));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.m, Long.valueOf(zzadVar.Y0));
        i();
        contentValues.put("triggered_event", zznd.p0(zzadVar.d1));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.f309o, Long.valueOf(zzadVar.Z.Z));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.j, Long.valueOf(zzadVar.e1));
        i();
        contentValues.put("expired_event", zznd.p0(zzadVar.f1));
        try {
            if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update conditional user property (got -1)", zzfr.v(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing conditional user property", zzfr.v(str), e);
            return true;
        }
    }

    public final boolean d0(zzaz zzazVar, long j2, boolean z) {
        n();
        u();
        Preconditions.r(zzazVar);
        Preconditions.l(zzazVar.a);
        byte[] k2 = o().D(zzazVar).k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzazVar.a);
        contentValues.put("name", zzazVar.b);
        contentValues.put("timestamp", Long.valueOf(zzazVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", k2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) == -1) {
                j().G().b("Failed to insert raw event (got -1). appId", zzfr.v(zzazVar.a));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing raw event. appId", zzfr.v(zzazVar.a), e);
            return false;
        }
    }

    @InterfaceC10697xN2
    public final boolean e0(zzne zzneVar) {
        Preconditions.r(zzneVar);
        n();
        u();
        if (F0(zzneVar.a, zzneVar.c) == null) {
            if (zznd.J0(zzneVar.c)) {
                if (x0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzneVar.a}) >= d().q(zzneVar.a, zzbi.I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzneVar.c) && x0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzneVar.a, zzneVar.b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzneVar.a);
        contentValues.put("origin", zzneVar.b);
        contentValues.put("name", zzneVar.c);
        contentValues.put("set_timestamp", Long.valueOf(zzneVar.d));
        T(contentValues, "value", zzneVar.e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update user property (got -1). appId", zzfr.v(zzneVar.a));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing user property. appId", zzfr.v(zzneVar.a), e);
            return true;
        }
    }

    @InterfaceC10697xN2
    public final boolean f0(String str, int i2, zzew.zzb zzbVar) {
        Integer num;
        Boolean bool;
        u();
        n();
        Preconditions.l(str);
        Preconditions.r(zzbVar);
        Integer num2 = null;
        if (zzbVar.O().isEmpty()) {
            zzft L = j().L();
            Object v = zzfr.v(str);
            Integer valueOf = Integer.valueOf(i2);
            if (zzbVar.U()) {
                num2 = Integer.valueOf(zzbVar.K());
            }
            L.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", v, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] k2 = zzbVar.k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        if (zzbVar.U()) {
            num = Integer.valueOf(zzbVar.K());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put(C2359d.e, zzbVar.O());
        if (zzbVar.V()) {
            bool = Boolean.valueOf(zzbVar.S());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", k2);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert event filter (got -1). appId", zzfr.v(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing event filter. appId", zzfr.v(str), e);
            return false;
        }
    }

    @InterfaceC10697xN2
    public final boolean g0(String str, int i2, zzew.zze zzeVar) {
        Integer num;
        Boolean bool;
        u();
        n();
        Preconditions.l(str);
        Preconditions.r(zzeVar);
        Integer num2 = null;
        if (zzeVar.K().isEmpty()) {
            zzft L = j().L();
            Object v = zzfr.v(str);
            Integer valueOf = Integer.valueOf(i2);
            if (zzeVar.O()) {
                num2 = Integer.valueOf(zzeVar.m());
            }
            L.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", v, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] k2 = zzeVar.k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        if (zzeVar.O()) {
            num = Integer.valueOf(zzeVar.m());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("property_name", zzeVar.K());
        if (zzeVar.P()) {
            bool = Boolean.valueOf(zzeVar.N());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", k2);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert property filter (got -1). appId", zzfr.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing property filter. appId", zzfr.v(str), e);
            return false;
        }
    }

    public final boolean h0(String str, Bundle bundle) {
        n();
        u();
        byte[] k2 = o().D(new zzaz(this.a, "", str, "dep", 0L, 0L, bundle)).k();
        j().K().c("Saving default event parameters, appId, data size", g().c(str), Integer.valueOf(k2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(BreadcrumbAnalyticsEventReceiver.c, k2);
        try {
            if (B().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert default event parameters (got -1). appId", zzfr.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing default event parameters. appId", zzfr.v(str), e);
            return false;
        }
    }

    @InterfaceC10697xN2
    public final boolean i0(String str, zzmh zzmhVar) {
        n();
        u();
        Preconditions.r(zzmhVar);
        Preconditions.l(str);
        long a = b().a();
        if (zzmhVar.Y < a - zzaf.M() || zzmhVar.Y > zzaf.M() + a) {
            j().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfr.v(str), Long.valueOf(a), Long.valueOf(zzmhVar.Y));
        }
        j().K().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmhVar.X);
        contentValues.put("source", Integer.valueOf(zzmhVar.Z));
        contentValues.put("timestamp_millis", Long.valueOf(zzmhVar.Y));
        try {
            if (B().insert("trigger_uris", null, contentValues) == -1) {
                j().G().b("Failed to insert trigger URI (got -1). appId", zzfr.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing trigger URI. appId", zzfr.v(str), e);
            return false;
        }
    }

    public final boolean j0(String str, Long l2, long j2, zzfi.zze zzeVar) {
        n();
        u();
        Preconditions.r(zzeVar);
        Preconditions.l(str);
        Preconditions.r(l2);
        byte[] k2 = zzeVar.k();
        j().K().c("Saving complex main event, appId, data size", g().c(str), Integer.valueOf(k2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", k2);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert complex main event (got -1). appId", zzfr.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Error storing complex main event. appId", zzfr.v(str), e);
            return false;
        }
    }

    @InterfaceC5056aJ2
    public final boolean u0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long v0(String str) {
        Preconditions.l(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final long w0(String str, String str2) {
        Preconditions.l(str);
        Preconditions.l(str2);
        n();
        u();
        SQLiteDatabase B = B();
        B.beginTransaction();
        long j2 = 0;
        try {
            try {
                long G = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (G == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (B.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        j().G().c("Failed to insert column (got -1). appId", zzfr.v(str), str2);
                        return -1L;
                    }
                    G = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + G));
                    if (B.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        j().G().c("Failed to update column (got 0). appId", zzfr.v(str), str2);
                        return -1L;
                    }
                    B.setTransactionSuccessful();
                    return G;
                } catch (SQLiteException e) {
                    e = e;
                    j2 = G;
                    j().G().d("Error inserting column. appId", zzfr.v(str), str2, e);
                    return j2;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            B.endTransaction();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean x() {
        return false;
    }

    @InterfaceC10697xN2
    public final long x0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                j().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long y() {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                j().G().b("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        j().G().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzne> y0(String str, String str2, String str3) {
        zzao zzaoVar;
        String str4;
        Preconditions.l(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str5 = str;
                arrayList2.add(str5);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (!TextUtils.isEmpty(str2)) {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e) {
                        e = e;
                        zzaoVar = this;
                        zzaoVar.j().G().d("(2)Error querying user properties", zzfr.v(str), str4, e);
                        List<zzne> list = Collections.EMPTY_LIST;
                        if (cursor != null) {
                            cursor.close();
                        }
                        return list;
                    }
                } else {
                    str4 = str2;
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(str3 + "*");
                    sb.append(" and name glob ?");
                }
                cursor = B().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() >= 1000) {
                        break;
                    }
                    String string = cursor.getString(0);
                    long j2 = cursor.getLong(1);
                    zzaoVar = this;
                    try {
                        try {
                            Object M = zzaoVar.M(cursor, 2);
                            str4 = cursor.getString(3);
                            if (M == null) {
                                zzaoVar.j().G().d("(2)Read invalid user property value, ignoring it", zzfr.v(str5), str4, str3);
                            } else {
                                arrayList.add(new zzne(str5, str4, string, j2, M));
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            str5 = str;
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzaoVar.j().G().d("(2)Error querying user properties", zzfr.v(str), str4, e);
                            List<zzne> list2 = Collections.EMPTY_LIST;
                            if (cursor != null) {
                            }
                            return list2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                cursor.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            zzaoVar = this;
            str4 = str2;
        }
    }

    @InterfaceC10697xN2
    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final boolean z0(String str, List<Integer> list) {
        Preconditions.l(str);
        u();
        n();
        SQLiteDatabase B = B();
        try {
            long x0 = x0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, d().u(str, zzbi.H)));
            if (x0 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            if (B.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + (C9811tl1.c + TextUtils.join(",", arrayList) + C9811tl1.d) + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)}) <= 0) {
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            j().G().c("Database error querying filters. appId", zzfr.v(str), e);
            return false;
        }
    }
}
