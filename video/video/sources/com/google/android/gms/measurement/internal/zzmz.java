package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.C2359d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.zzih;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import o.C6566gU0;
import o.InterfaceC10697xN2;
import o.JK1;
import o.SQ0;
import o.TD0;
import o.UE;

/* loaded from: classes3.dex */
public final class zzmz extends zzmo {
    public zzmz(zzmp zzmpVar) {
        super(zzmpVar);
    }

    public static zzfi.zzg E(zzfi.zze zzeVar, String str) {
        for (zzfi.zzg zzgVar : zzeVar.c0()) {
            if (zzgVar.c0().equals(str)) {
                return zzgVar;
            }
        }
        return null;
    }

    public static <BuilderT extends com.google.android.gms.internal.measurement.zzkm> BuilderT F(BuilderT buildert, byte[] bArr) throws com.google.android.gms.internal.measurement.zzji {
        com.google.android.gms.internal.measurement.zzik a = com.google.android.gms.internal.measurement.zzik.a();
        if (a != null) {
            return (BuilderT) buildert.I1(bArr, a);
        }
        return (BuilderT) buildert.B0(bArr);
    }

    public static String L(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static List<Long> M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static void P(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static void Q(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                P(builder, str3, string, set);
            }
        }
    }

    public static void R(zzfi.zze.zza zzaVar, String str, Object obj) {
        List<zzfi.zzg> K = zzaVar.K();
        int i = 0;
        while (true) {
            if (i < K.size()) {
                if (str.equals(K.get(i).c0())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        zzfi.zzg.zza A = zzfi.zzg.Y().A(str);
        if (obj instanceof Long) {
            A.x(((Long) obj).longValue());
        } else if (obj instanceof String) {
            A.C((String) obj);
        } else if (obj instanceof Double) {
            A.w(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            zzaVar.x(i, A);
        } else {
            zzaVar.A(A);
        }
    }

    public static void V(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(TD0.a.Y0);
        }
    }

    public static void X(StringBuilder sb, int i, String str, zzew.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        V(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.M()) {
            Z(sb, i, "comparison_type", zzdVar.F().name());
        }
        if (zzdVar.O()) {
            Z(sb, i, "match_as_float", Boolean.valueOf(zzdVar.L()));
        }
        if (zzdVar.N()) {
            Z(sb, i, "comparison_value", zzdVar.I());
        }
        if (zzdVar.Q()) {
            Z(sb, i, "min_comparison_value", zzdVar.K());
        }
        if (zzdVar.P()) {
            Z(sb, i, "max_comparison_value", zzdVar.J());
        }
        V(sb, i);
        sb.append("}\n");
    }

    public static void Y(StringBuilder sb, int i, String str, zzfi.zzl zzlVar) {
        Integer num;
        Integer num2;
        Long l;
        if (zzlVar == null) {
            return;
        }
        V(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzlVar.I() != 0) {
            V(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l2 : zzlVar.Y()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(C6566gU0.h);
                }
                sb.append(l2);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzlVar.Q() != 0) {
            V(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l3 : zzlVar.b0()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(C6566gU0.h);
                }
                sb.append(l3);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzlVar.m() != 0) {
            V(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (zzfi.zzd zzdVar : zzlVar.X()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(C6566gU0.h);
                }
                if (zzdVar.N()) {
                    num2 = Integer.valueOf(zzdVar.m());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (zzdVar.M()) {
                    l = Long.valueOf(zzdVar.J());
                } else {
                    l = null;
                }
                sb.append(l);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzlVar.M() != 0) {
            V(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (zzfi.zzm zzmVar : zzlVar.Z()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(C6566gU0.h);
                }
                if (zzmVar.O()) {
                    num = Integer.valueOf(zzmVar.J());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                int i10 = 0;
                for (Long l4 : zzmVar.N()) {
                    long longValue = l4.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(C6566gU0.h);
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append(C6566gU0.g);
                i8 = i9;
            }
            sb.append("}\n");
        }
        V(sb, 3);
        sb.append("}\n");
    }

    public static void Z(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        V(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    @InterfaceC10697xN2
    public static boolean c0(zzbg zzbgVar, zzo zzoVar) {
        Preconditions.r(zzbgVar);
        Preconditions.r(zzoVar);
        if (TextUtils.isEmpty(zzoVar.Y) && TextUtils.isEmpty(zzoVar.l1)) {
            return false;
        }
        return true;
    }

    public static boolean d0(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & list.get(i / 64).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Object e0(zzfi.zze zzeVar, String str) {
        zzfi.zzg E = E(zzeVar, str);
        if (E != null) {
            if (E.k0()) {
                return E.d0();
            }
            if (E.i0()) {
                return Long.valueOf(E.W());
            }
            if (E.g0()) {
                return Double.valueOf(E.F());
            }
            if (E.U() > 0) {
                List<zzfi.zzg> f0 = E.f0();
                ArrayList arrayList = new ArrayList();
                for (zzfi.zzg zzgVar : f0) {
                    if (zzgVar != null) {
                        Bundle bundle = new Bundle();
                        for (zzfi.zzg zzgVar2 : zzgVar.f0()) {
                            if (zzgVar2.k0()) {
                                bundle.putString(zzgVar2.c0(), zzgVar2.d0());
                            } else if (zzgVar2.i0()) {
                                bundle.putLong(zzgVar2.c0(), zzgVar2.W());
                            } else if (zzgVar2.g0()) {
                                bundle.putDouble(zzgVar2.c0(), zzgVar2.F());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static boolean f0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static int y(zzfi.zzj.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i = 0; i < zzaVar.J(); i++) {
            if (str.equals(zzaVar.C0(i).Y())) {
                return i;
            }
        }
        return -1;
    }

    @InterfaceC10697xN2
    public final long A(byte[] bArr) {
        Preconditions.r(bArr);
        i().n();
        MessageDigest T0 = zznd.T0();
        if (T0 == null) {
            j().G().a("Failed to get MD5");
            return 0L;
        }
        return zznd.B(T0.digest(bArr));
    }

    public final Bundle B(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        arrayList2.add(B((Map) obj2, false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public final <T extends Parcelable> T C(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            j().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzfi.zze D(zzaz zzazVar) {
        zzfi.zze.zza z = zzfi.zze.Y().z(zzazVar.e);
        Iterator<String> it = zzazVar.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfi.zzg.zza A = zzfi.zzg.Y().A(next);
            Object I0 = zzazVar.f.I0(next);
            Preconditions.r(I0);
            S(A, I0);
            z.A(A);
        }
        return (zzfi.zze) ((com.google.android.gms.internal.measurement.zzix) z.e0());
    }

    public final zzbg G(com.google.android.gms.internal.measurement.zzad zzadVar) {
        String str;
        Object obj;
        Bundle B = B(zzadVar.g(), true);
        if (B.containsKey(CrashlyticsAnalyticsListener.c) && (obj = B.get(CrashlyticsAnalyticsListener.c)) != null) {
            str = obj.toString();
        } else {
            str = FirebaseMessaging.r;
        }
        String str2 = str;
        String b = zzii.b(zzadVar.e());
        if (b == null) {
            b = zzadVar.e();
        }
        return new zzbg(b, new zzbb(B), str2, zzadVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a9  */
    @TargetApi(30)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzmh H(String str, zzfi.zzj zzjVar, zzfi.zze.zza zzaVar, String str2) {
        String str3;
        int indexOf;
        if (zzpg.a() && d().B(str, zzbi.L0)) {
            long a = b().a();
            String[] split = d().z(str, zzbi.e0).split(",");
            HashSet hashSet = new HashSet(split.length);
            for (String str4 : split) {
                str4.getClass();
                if (!hashSet.add(str4)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str4));
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
            zzmn t = t();
            String Q = t.r().Q(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(t.d().z(str, zzbi.Y));
            if (!TextUtils.isEmpty(Q)) {
                builder.authority(Q + UE.h + t.d().z(str, zzbi.Z));
            } else {
                builder.authority(t.d().z(str, zzbi.Z));
            }
            builder.path(t.d().z(str, zzbi.a0));
            P(builder, GmsRpc.A, zzjVar.l0(), unmodifiableSet);
            P(builder, "gmp_version", "82001", unmodifiableSet);
            String I3 = zzjVar.I3();
            zzaf d = d();
            zzfi<Boolean> zzfiVar = zzbi.O0;
            String str5 = "";
            if (d.B(str, zzfiVar) && r().a0(str)) {
                I3 = "";
            }
            P(builder, "app_instance_id", I3, unmodifiableSet);
            P(builder, "rdid", zzjVar.p0(), unmodifiableSet);
            P(builder, "bundle_id", zzjVar.H3(), unmodifiableSet);
            String J = zzaVar.J();
            String a2 = zzii.a(J);
            if (!TextUtils.isEmpty(a2)) {
                J = a2;
            }
            P(builder, "app_event_name", J, unmodifiableSet);
            P(builder, "app_version", String.valueOf(zzjVar.G0()), unmodifiableSet);
            String n0 = zzjVar.n0();
            if (d().B(str, zzfiVar) && r().e0(str)) {
                if (d().B(str, zzbi.B0)) {
                    if (!TextUtils.isEmpty(n0) && (indexOf = n0.indexOf(UE.h)) != -1) {
                        n0 = n0.substring(0, indexOf);
                    }
                }
                P(builder, "os_version", str5, unmodifiableSet);
                P(builder, "timestamp", String.valueOf(zzaVar.H()), unmodifiableSet);
                str3 = "1";
                if (zzjVar.x0()) {
                    P(builder, "lat", "1", unmodifiableSet);
                }
                P(builder, "privacy_sandbox_version", String.valueOf(zzjVar.m()), unmodifiableSet);
                P(builder, "trigger_uri_source", "1", unmodifiableSet);
                P(builder, "trigger_uri_timestamp", String.valueOf(a), unmodifiableSet);
                if (str2 != null) {
                    P(builder, "request_uuid", str2, unmodifiableSet);
                }
                List<zzfi.zzg> K = zzaVar.K();
                Bundle bundle = new Bundle();
                for (zzfi.zzg zzgVar : K) {
                    String c0 = zzgVar.c0();
                    if (zzgVar.g0()) {
                        bundle.putString(c0, String.valueOf(zzgVar.F()));
                    } else if (zzgVar.h0()) {
                        bundle.putString(c0, String.valueOf(zzgVar.Q()));
                    } else if (zzgVar.k0()) {
                        bundle.putString(c0, zzgVar.d0());
                    } else if (zzgVar.i0()) {
                        bundle.putString(c0, String.valueOf(zzgVar.W()));
                    }
                }
                Q(builder, d().z(str, zzbi.d0).split("\\|"), bundle, unmodifiableSet);
                List<zzfi.zzn> u0 = zzjVar.u0();
                Bundle bundle2 = new Bundle();
                for (zzfi.zzn zznVar : u0) {
                    String Y = zznVar.Y();
                    if (zznVar.b0()) {
                        bundle2.putString(Y, String.valueOf(zznVar.F()));
                    } else if (zznVar.c0()) {
                        bundle2.putString(Y, String.valueOf(zznVar.N()));
                    } else if (zznVar.g0()) {
                        bundle2.putString(Y, zznVar.Z());
                    } else if (zznVar.d0()) {
                        bundle2.putString(Y, String.valueOf(zznVar.T()));
                    }
                }
                Q(builder, d().z(str, zzbi.c0).split("\\|"), bundle2, unmodifiableSet);
                if (zznp.a() && d().s(zzbi.T0)) {
                    if (!zzjVar.w0()) {
                        str3 = "0";
                    }
                    P(builder, "dma", str3, unmodifiableSet);
                    if (!zzjVar.h0().isEmpty()) {
                        P(builder, "dma_cps", zzjVar.h0(), unmodifiableSet);
                    }
                }
                return new zzmh(builder.build().toString(), a, 1);
            }
            str5 = n0;
            P(builder, "os_version", str5, unmodifiableSet);
            P(builder, "timestamp", String.valueOf(zzaVar.H()), unmodifiableSet);
            str3 = "1";
            if (zzjVar.x0()) {
            }
            P(builder, "privacy_sandbox_version", String.valueOf(zzjVar.m()), unmodifiableSet);
            P(builder, "trigger_uri_source", "1", unmodifiableSet);
            P(builder, "trigger_uri_timestamp", String.valueOf(a), unmodifiableSet);
            if (str2 != null) {
            }
            List<zzfi.zzg> K2 = zzaVar.K();
            Bundle bundle3 = new Bundle();
            while (r14.hasNext()) {
            }
            Q(builder, d().z(str, zzbi.d0).split("\\|"), bundle3, unmodifiableSet);
            List<zzfi.zzn> u02 = zzjVar.u0();
            Bundle bundle22 = new Bundle();
            while (r14.hasNext()) {
            }
            Q(builder, d().z(str, zzbi.c0).split("\\|"), bundle22, unmodifiableSet);
            if (zznp.a()) {
                if (!zzjVar.w0()) {
                }
                P(builder, "dma", str3, unmodifiableSet);
                if (!zzjVar.h0().isEmpty()) {
                }
            }
            return new zzmh(builder.build().toString(), a, 1);
        }
        return null;
    }

    public final String I(zzew.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzbVar.U()) {
            Z(sb, 0, "filter_id", Integer.valueOf(zzbVar.K()));
        }
        Z(sb, 0, C2359d.e, g().c(zzbVar.O()));
        String L = L(zzbVar.Q(), zzbVar.R(), zzbVar.S());
        if (!L.isEmpty()) {
            Z(sb, 0, "filter_type", L);
        }
        if (zzbVar.T()) {
            X(sb, 1, "event_count_filter", zzbVar.N());
        }
        if (zzbVar.m() > 0) {
            sb.append("  filters {\n");
            for (zzew.zzc zzcVar : zzbVar.P()) {
                W(sb, 2, zzcVar);
            }
        }
        V(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String J(zzew.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzeVar.O()) {
            Z(sb, 0, "filter_id", Integer.valueOf(zzeVar.m()));
        }
        Z(sb, 0, "property_name", g().g(zzeVar.K()));
        String L = L(zzeVar.L(), zzeVar.M(), zzeVar.N());
        if (!L.isEmpty()) {
            Z(sb, 0, "filter_type", L);
        }
        W(sb, 1, zzeVar.H());
        sb.append("}\n");
        return sb.toString();
    }

    public final String K(zzfi.zzi zziVar) {
        Long l;
        Long l2;
        zzfi.zzb D3;
        if (zziVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzfi.zzj zzjVar : zziVar.K()) {
            if (zzjVar != null) {
                V(sb, 1);
                sb.append("bundle {\n");
                if (zzjVar.c1()) {
                    Z(sb, 1, "protocol_version", Integer.valueOf(zzjVar.Y1()));
                }
                if (zzps.a() && d().B(zzjVar.H3(), zzbi.y0) && zzjVar.f1()) {
                    Z(sb, 1, "session_stitching_token", zzjVar.q0());
                }
                Z(sb, 1, "platform", zzjVar.o0());
                if (zzjVar.X0()) {
                    Z(sb, 1, "gmp_version", Long.valueOf(zzjVar.h3()));
                }
                if (zzjVar.k1()) {
                    Z(sb, 1, "uploading_gmp_version", Long.valueOf(zzjVar.A3()));
                }
                if (zzjVar.V0()) {
                    Z(sb, 1, "dynamite_version", Long.valueOf(zzjVar.U2()));
                }
                if (zzjVar.E0()) {
                    Z(sb, 1, "config_version", Long.valueOf(zzjVar.G2()));
                }
                Z(sb, 1, GmsRpc.A, zzjVar.l0());
                Z(sb, 1, "admob_app_id", zzjVar.G3());
                Z(sb, 1, "app_id", zzjVar.H3());
                Z(sb, 1, "app_version", zzjVar.d0());
                if (zzjVar.z0()) {
                    Z(sb, 1, "app_version_major", Integer.valueOf(zzjVar.G0()));
                }
                Z(sb, 1, "firebase_instance_id", zzjVar.k0());
                if (zzjVar.U0()) {
                    Z(sb, 1, "dev_cert_hash", Long.valueOf(zzjVar.N2()));
                }
                Z(sb, 1, "app_store", zzjVar.J3());
                if (zzjVar.j1()) {
                    Z(sb, 1, "upload_timestamp_millis", Long.valueOf(zzjVar.x3()));
                }
                if (zzjVar.g1()) {
                    Z(sb, 1, "start_timestamp_millis", Long.valueOf(zzjVar.r3()));
                }
                if (zzjVar.W0()) {
                    Z(sb, 1, "end_timestamp_millis", Long.valueOf(zzjVar.b3()));
                }
                if (zzjVar.b1()) {
                    Z(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzjVar.o3()));
                }
                if (zzjVar.a1()) {
                    Z(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzjVar.l3()));
                }
                Z(sb, 1, "app_instance_id", zzjVar.I3());
                Z(sb, 1, "resettable_device_id", zzjVar.p0());
                Z(sb, 1, "ds_id", zzjVar.j0());
                if (zzjVar.Z0()) {
                    Z(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzjVar.x0()));
                }
                Z(sb, 1, "os_version", zzjVar.n0());
                Z(sb, 1, SQ0.m, zzjVar.i0());
                Z(sb, 1, "user_default_language", zzjVar.r0());
                if (zzjVar.i1()) {
                    Z(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzjVar.q2()));
                }
                if (zzjVar.C0()) {
                    Z(sb, 1, "bundle_sequential_index", Integer.valueOf(zzjVar.l1()));
                }
                if (zzjVar.e1()) {
                    Z(sb, 1, "service_upload", Boolean.valueOf(zzjVar.y0()));
                }
                Z(sb, 1, "health_monitor", zzjVar.m0());
                if (zzjVar.d1()) {
                    Z(sb, 1, "retry_counter", Integer.valueOf(zzjVar.i2()));
                }
                if (zzjVar.S0()) {
                    Z(sb, 1, "consent_signals", zzjVar.g0());
                }
                if (zzjVar.Y0()) {
                    Z(sb, 1, "is_dma_region", Boolean.valueOf(zzjVar.w0()));
                }
                if (zzjVar.T0()) {
                    Z(sb, 1, "core_platform_services", zzjVar.h0());
                }
                if (zzjVar.F0()) {
                    Z(sb, 1, "consent_diagnostics", zzjVar.f0());
                }
                if (zzjVar.h1()) {
                    Z(sb, 1, "target_os_version", Long.valueOf(zzjVar.u3()));
                }
                if (zzpg.a() && d().B(zzjVar.H3(), zzbi.L0)) {
                    Z(sb, 1, "ad_services_version", Integer.valueOf(zzjVar.m()));
                    if (zzjVar.A0() && (D3 = zzjVar.D3()) != null) {
                        V(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Z(sb, 2, "eligible", Boolean.valueOf(D3.W()));
                        Z(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(D3.b0()));
                        Z(sb, 2, "pre_r", Boolean.valueOf(D3.c0()));
                        Z(sb, 2, "r_extensions_too_old", Boolean.valueOf(D3.d0()));
                        Z(sb, 2, "adservices_extension_too_old", Boolean.valueOf(D3.T()));
                        Z(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(D3.Q()));
                        Z(sb, 2, "measurement_manager_disabled", Boolean.valueOf(D3.Z()));
                        V(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<zzfi.zzn> u0 = zzjVar.u0();
                if (u0 != null) {
                    for (zzfi.zzn zznVar : u0) {
                        if (zznVar != null) {
                            V(sb, 2);
                            sb.append("user_property {\n");
                            Double d = null;
                            if (zznVar.f0()) {
                                l = Long.valueOf(zznVar.V());
                            } else {
                                l = null;
                            }
                            Z(sb, 2, "set_timestamp_millis", l);
                            Z(sb, 2, "name", g().g(zznVar.Y()));
                            Z(sb, 2, "string_value", zznVar.Z());
                            if (zznVar.d0()) {
                                l2 = Long.valueOf(zznVar.T());
                            } else {
                                l2 = null;
                            }
                            Z(sb, 2, "int_value", l2);
                            if (zznVar.b0()) {
                                d = Double.valueOf(zznVar.F());
                            }
                            Z(sb, 2, "double_value", d);
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfi.zzc> s0 = zzjVar.s0();
                zzjVar.H3();
                if (s0 != null) {
                    for (zzfi.zzc zzcVar : s0) {
                        if (zzcVar != null) {
                            V(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzcVar.S()) {
                                Z(sb, 2, "audience_id", Integer.valueOf(zzcVar.m()));
                            }
                            if (zzcVar.T()) {
                                Z(sb, 2, "new_audience", Boolean.valueOf(zzcVar.R()));
                            }
                            Y(sb, 2, "current_data", zzcVar.P());
                            if (zzcVar.U()) {
                                Y(sb, 2, "previous_data", zzcVar.Q());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfi.zze> t0 = zzjVar.t0();
                if (t0 != null) {
                    for (zzfi.zze zzeVar : t0) {
                        if (zzeVar != null) {
                            V(sb, 2);
                            sb.append("event {\n");
                            Z(sb, 2, "name", g().c(zzeVar.b0()));
                            if (zzeVar.g0()) {
                                Z(sb, 2, "timestamp_millis", Long.valueOf(zzeVar.X()));
                            }
                            if (zzeVar.f0()) {
                                Z(sb, 2, "previous_timestamp_millis", Long.valueOf(zzeVar.W()));
                            }
                            if (zzeVar.d0()) {
                                Z(sb, 2, "count", Integer.valueOf(zzeVar.m()));
                            }
                            if (zzeVar.S() != 0) {
                                a0(sb, 2, zzeVar.c0());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                V(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final List<Long> N(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                j().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    j().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r5.add(O((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> O(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public final void S(zzfi.zzg.zza zzaVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.r(obj);
        zzaVar.F().D().B().E();
        if (obj instanceof String) {
            zzaVar.C((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.w(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfi.zzg.zza Y = zzfi.zzg.Y();
                    for (String str : bundle.keySet()) {
                        zzfi.zzg.zza A = zzfi.zzg.Y().A(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            A.x(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            A.C((String) obj2);
                        } else if (obj2 instanceof Double) {
                            A.w(((Double) obj2).doubleValue());
                        }
                        Y.y(A);
                    }
                    if (Y.v() > 0) {
                        arrayList.add((zzfi.zzg) ((com.google.android.gms.internal.measurement.zzix) Y.e0()));
                    }
                }
            }
            zzaVar.z(arrayList);
        } else {
            j().G().b("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void T(zzfi.zzj.zza zzaVar) {
        j().K().a("Checking account type status for ad personalization signals");
        if (h0(zzaVar.a1())) {
            j().F().a("Turning off ad personalization due to account type");
            zzfi.zzn zznVar = (zzfi.zzn) ((com.google.android.gms.internal.measurement.zzix) zzfi.zzn.W().y("_npa").A(e().u()).x(1L).e0());
            int i = 0;
            while (true) {
                if (i < zzaVar.J()) {
                    if ("_npa".equals(zzaVar.C0(i).Y())) {
                        zzaVar.z(i, zznVar);
                        break;
                    }
                    i++;
                } else {
                    zzaVar.F(zznVar);
                    break;
                }
            }
            if (zznp.a() && d().s(zzbi.T0)) {
                zzak b = zzak.b(zzaVar.c1());
                b.d(zzih.zza.AD_PERSONALIZATION, zzaj.CHILD_ACCOUNT);
                zzaVar.l0(b.toString());
            }
        }
    }

    public final void U(zzfi.zzn.zza zzaVar, Object obj) {
        Preconditions.r(obj);
        zzaVar.C().z().v();
        if (obj instanceof String) {
            zzaVar.B((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.w(((Double) obj).doubleValue());
        } else {
            j().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void W(StringBuilder sb, int i, zzew.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        V(sb, i);
        sb.append("filter {\n");
        if (zzcVar.N()) {
            Z(sb, i, "complement", Boolean.valueOf(zzcVar.M()));
        }
        if (zzcVar.P()) {
            Z(sb, i, "param_name", g().f(zzcVar.L()));
        }
        if (zzcVar.Q()) {
            int i2 = i + 1;
            zzew.zzf K = zzcVar.K();
            if (K != null) {
                V(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (K.N()) {
                    Z(sb, i2, "match_type", K.F().name());
                }
                if (K.M()) {
                    Z(sb, i2, "expression", K.I());
                }
                if (K.L()) {
                    Z(sb, i2, "case_sensitive", Boolean.valueOf(K.K()));
                }
                if (K.m() > 0) {
                    V(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str : K.J()) {
                        V(sb, i + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                V(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzcVar.O()) {
            X(sb, i + 1, "number_filter", zzcVar.J());
        }
        V(sb, i);
        sb.append("}\n");
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(StringBuilder sb, int i, List<zzfi.zzg> list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            for (zzfi.zzg zzgVar : list) {
                if (zzgVar != null) {
                    V(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (zzgVar.j0()) {
                        str = g().f(zzgVar.c0());
                    } else {
                        str = null;
                    }
                    Z(sb, i2, "name", str);
                    if (zzgVar.k0()) {
                        str2 = zzgVar.d0();
                    } else {
                        str2 = null;
                    }
                    Z(sb, i2, "string_value", str2);
                    if (zzgVar.i0()) {
                        l = Long.valueOf(zzgVar.W());
                    } else {
                        l = null;
                    }
                    Z(sb, i2, "int_value", l);
                    if (zzgVar.g0()) {
                        d = Double.valueOf(zzgVar.F());
                    }
                    Z(sb, i2, "double_value", d);
                    if (zzgVar.U() > 0) {
                        a0(sb, i2, zzgVar.f0());
                    }
                    V(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final boolean b0(long j, long j2) {
        if (j != 0 && j2 > 0 && Math.abs(b().a() - j) <= j2) {
            return false;
        }
        return true;
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

    public final byte[] g0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            j().G().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    public final boolean h0(String str) {
        Preconditions.r(str);
        zzh D0 = q().D0(str);
        if (D0 == null || !e().y() || !D0.q() || !r().V(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    public final byte[] i0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            j().G().b("Failed to ungzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    public final List<Integer> j0() {
        Map<String, String> c = zzbi.c(this.b.a());
        if (c == null || c.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzbi.R.a(null).intValue();
        for (Map.Entry<String, String> entry : c.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            j().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    j().L().b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzt p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzao q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzgp r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzls s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmn t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean x() {
        return false;
    }

    public final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(Charset.forName("UTF-8")));
    }
}
