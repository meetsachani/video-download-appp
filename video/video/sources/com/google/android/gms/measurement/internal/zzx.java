package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzx {
    public zzfi.zze a;
    public Long b;
    public long c;
    public final /* synthetic */ zzt d;

    public final zzfi.zze a(String str, zzfi.zze zzeVar) {
        boolean z;
        Object obj;
        String b0 = zzeVar.b0();
        List<zzfi.zzg> c0 = zzeVar.c0();
        this.d.o();
        Long l = (Long) zzmz.e0(zzeVar, "_eid");
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && b0.equals("_ep")) {
            Preconditions.r(l);
            this.d.o();
            b0 = (String) zzmz.e0(zzeVar, "_en");
            if (TextUtils.isEmpty(b0)) {
                this.d.j().I().b("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                Pair<zzfi.zze, Long> H = this.d.q().H(str, l);
                if (H != null && (obj = H.first) != null) {
                    this.a = (zzfi.zze) obj;
                    this.c = ((Long) H.second).longValue();
                    this.d.o();
                    this.b = (Long) zzmz.e0(this.a, "_eid");
                } else {
                    this.d.j().I().c("Extra parameter without existing main event. eventName, eventId", b0, l);
                    return null;
                }
            }
            long j = this.c - 1;
            this.c = j;
            if (j <= 0) {
                zzao q = this.d.q();
                q.n();
                q.j().K().b("Clearing complex main event info. appId", str);
                try {
                    q.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    q.j().G().b("Error clearing complex main event", e);
                }
            } else {
                this.d.q().j0(str, l, this.c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfi.zzg zzgVar : this.a.c0()) {
                this.d.o();
                if (zzmz.E(zzeVar, zzgVar.c0()) == null) {
                    arrayList.add(zzgVar);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(c0);
                c0 = arrayList;
            } else {
                this.d.j().I().b("No unique parameters in main event. eventName", b0);
            }
        } else if (z) {
            this.b = l;
            this.a = zzeVar;
            this.d.o();
            Object obj2 = 0L;
            Object e0 = zzmz.e0(zzeVar, "_epc");
            if (e0 != null) {
                obj2 = e0;
            }
            long longValue = ((Long) obj2).longValue();
            this.c = longValue;
            if (longValue <= 0) {
                this.d.j().I().b("Complex event with zero extra param count. eventName", b0);
            } else {
                this.d.q().j0(str, (Long) Preconditions.r(l), this.c, zzeVar);
            }
        }
        return (zzfi.zze) ((com.google.android.gms.internal.measurement.zzix) zzeVar.x().D(b0).I().C(c0).e0());
    }

    public zzx(zzt zztVar) {
        this.d = zztVar;
    }
}
