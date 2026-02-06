package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.AbstractC4253Sp2;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
/* loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getParcel", id = 2)
    public final Parcel Y;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    public final zan Y0;
    public final int Z;
    @InterfaceC11300zs1
    public final String Z0;
    public int a1;
    public int b1;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zanVar) {
        this.X = i;
        this.Y = (Parcel) Preconditions.r(parcel);
        this.Z = 2;
        this.Y0 = zanVar;
        this.Z0 = zanVar == null ? null : zanVar.m0();
        this.a1 = 2;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse l0(@InterfaceC5670cr1 T t) {
        zan zanVar = new zan(t.getClass());
        o0(zanVar, t);
        zanVar.E0();
        zanVar.G0();
        return new SafeParcelResponse(t, zanVar, (String) Preconditions.r(t.getClass().getCanonicalName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o0(zan zanVar, FastJsonResponse fastJsonResponse) {
        String str;
        String str2;
        Class<?> cls = fastJsonResponse.getClass();
        if (!zanVar.I0(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> c = fastJsonResponse.c();
            zanVar.H0(cls, c);
            for (String str3 : c.keySet()) {
                FastJsonResponse.Field<?, ?> field = c.get(str3);
                Class<? extends FastJsonResponse> cls2 = field.c1;
                if (cls2 != null) {
                    try {
                        o0(zanVar, cls2.newInstance());
                    } catch (IllegalAccessException e) {
                        String valueOf = String.valueOf(((Class) Preconditions.r(field.c1)).getCanonicalName());
                        if (valueOf.length() != 0) {
                            str2 = "Could not access object of type ".concat(valueOf);
                        } else {
                            str2 = new String("Could not access object of type ");
                        }
                        throw new IllegalStateException(str2, e);
                    } catch (InstantiationException e2) {
                        String valueOf2 = String.valueOf(((Class) Preconditions.r(field.c1)).getCanonicalName());
                        if (valueOf2.length() != 0) {
                            str = "Could not instantiate an object of type ".concat(valueOf2);
                        } else {
                            str = new String("Could not instantiate an object of type ");
                        }
                        throw new IllegalStateException(str, e2);
                    }
                }
            }
        }
    }

    public static final void t0(StringBuilder sb, int i, @InterfaceC11300zs1 Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append(AbstractC4253Sp2.b.x1);
                sb.append(JsonUtils.b(Preconditions.r(obj).toString()));
                sb.append(AbstractC4253Sp2.b.x1);
                return;
            case 8:
                sb.append(AbstractC4253Sp2.b.x1);
                sb.append(Base64Utils.d((byte[]) obj));
                sb.append(AbstractC4253Sp2.b.x1);
                return;
            case 9:
                sb.append(AbstractC4253Sp2.b.x1);
                sb.append(Base64Utils.e((byte[]) obj));
                sb.append(AbstractC4253Sp2.b.x1);
                return;
            case 10:
                MapUtils.a(sb, (HashMap) Preconditions.r(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final void v0(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.Z) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append(C6566gU0.f);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                t0(sb, field.Y, arrayList.get(i));
            }
            sb.append(C6566gU0.g);
            return;
        }
        t0(sb, field.Y, obj);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void B(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 BigDecimal bigDecimal) {
        q0(field);
        SafeParcelWriter.c(this.Y, field.e1(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void D(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<BigDecimal> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.d(this.Y, field.e1(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void I(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 BigInteger bigInteger) {
        q0(field);
        SafeParcelWriter.e(this.Y, field.e1(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void K(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<BigInteger> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.f(this.Y, field.e1(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void O(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Boolean> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = arrayList.get(i).booleanValue();
        }
        SafeParcelWriter.h(this.Y, field.e1(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void S(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, double d) {
        q0(field);
        SafeParcelWriter.r(this.Y, field.e1(), d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void W(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Double> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).doubleValue();
        }
        SafeParcelWriter.s(this.Y, field.e1(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void Y(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, float f) {
        q0(field);
        SafeParcelWriter.w(this.Y, field.e1(), f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void a(@InterfaceC5670cr1 FastJsonResponse.Field field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<T> arrayList) {
        q0(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.r(arrayList)).size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i)).m0());
        }
        SafeParcelWriter.Q(this.Y, field.e1(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void a0(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Float> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList.get(i).floatValue();
        }
        SafeParcelWriter.x(this.Y, field.e1(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void b(@InterfaceC5670cr1 FastJsonResponse.Field field, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 T t) {
        q0(field);
        SafeParcelWriter.O(this.Y, field.e1(), ((SafeParcelResponse) t).m0(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @InterfaceC11300zs1
    public final Map<String, FastJsonResponse.Field<?, ?>> c() {
        zan zanVar = this.Y0;
        if (zanVar == null) {
            return null;
        }
        return zanVar.B0((String) Preconditions.r(this.Z0));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @InterfaceC5670cr1
    public final Object e(@InterfaceC5670cr1 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void e0(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Integer> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = arrayList.get(i).intValue();
        }
        SafeParcelWriter.G(this.Y, field.e1(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean g(@InterfaceC5670cr1 String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void h(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, boolean z) {
        q0(field);
        SafeParcelWriter.g(this.Y, field.e1(), z);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void h0(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Long> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = arrayList.get(i).longValue();
        }
        SafeParcelWriter.L(this.Y, field.e1(), jArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void k(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 byte[] bArr) {
        q0(field);
        SafeParcelWriter.m(this.Y, field.e1(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void m(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, int i) {
        q0(field);
        SafeParcelWriter.F(this.Y, field.e1(), i);
    }

    @InterfaceC5670cr1
    public final Parcel m0() {
        int i = this.a1;
        if (i != 0) {
            if (i == 1) {
                SafeParcelWriter.b(this.Y, this.b1);
                this.a1 = 2;
            }
        } else {
            int a = SafeParcelWriter.a(this.Y);
            this.b1 = a;
            SafeParcelWriter.b(this.Y, a);
            this.a1 = 2;
        }
        return this.Y;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void n(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, long j) {
        q0(field);
        SafeParcelWriter.K(this.Y, field.e1(), j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void o(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2) {
        q0(field);
        SafeParcelWriter.Y(this.Y, field.e1(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void q(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 Map<String, String> map) {
        q0(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.r(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.k(this.Y, field.e1(), bundle, true);
    }

    public final void q0(FastJsonResponse.Field<?, ?> field) {
        if (field.b1 != -1) {
            Parcel parcel = this.Y;
            if (parcel != null) {
                int i = this.a1;
                if (i != 0) {
                    if (i == 1) {
                        return;
                    }
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
                this.b1 = SafeParcelWriter.a(parcel);
                this.a1 = 1;
                return;
            }
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void s(@InterfaceC5670cr1 FastJsonResponse.Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<String> arrayList) {
        q0(field);
        int size = ((ArrayList) Preconditions.r(arrayList)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.Z(this.Y, field.e1(), strArr, true);
    }

    public final void s0(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().e1(), entry);
        }
        sb.append('{');
        int i0 = SafeParcelReader.i0(parcel);
        boolean z = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.X(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.O(X));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append(AbstractC4253Sp2.b.x1);
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.d3()) {
                    int i = field.Y0;
                    switch (i) {
                        case 0:
                            v0(sb, field, FastJsonResponse.w(field, Integer.valueOf(SafeParcelReader.Z(parcel, X))));
                            break;
                        case 1:
                            v0(sb, field, FastJsonResponse.w(field, SafeParcelReader.c(parcel, X)));
                            break;
                        case 2:
                            v0(sb, field, FastJsonResponse.w(field, Long.valueOf(SafeParcelReader.c0(parcel, X))));
                            break;
                        case 3:
                            v0(sb, field, FastJsonResponse.w(field, Float.valueOf(SafeParcelReader.V(parcel, X))));
                            break;
                        case 4:
                            v0(sb, field, FastJsonResponse.w(field, Double.valueOf(SafeParcelReader.T(parcel, X))));
                            break;
                        case 5:
                            v0(sb, field, FastJsonResponse.w(field, SafeParcelReader.a(parcel, X)));
                            break;
                        case 6:
                            v0(sb, field, FastJsonResponse.w(field, Boolean.valueOf(SafeParcelReader.P(parcel, X))));
                            break;
                        case 7:
                            v0(sb, field, FastJsonResponse.w(field, SafeParcelReader.G(parcel, X)));
                            break;
                        case 8:
                        case 9:
                            v0(sb, field, FastJsonResponse.w(field, SafeParcelReader.h(parcel, X)));
                            break;
                        case 10:
                            Bundle g = SafeParcelReader.g(parcel, X);
                            HashMap hashMap = new HashMap();
                            for (String str : g.keySet()) {
                                hashMap.put(str, (String) Preconditions.r(g.getString(str)));
                            }
                            v0(sb, field, FastJsonResponse.w(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.Z0) {
                    sb.append(C6566gU0.f);
                    switch (field.Y0) {
                        case 0:
                            ArrayUtils.l(sb, SafeParcelReader.u(parcel, X));
                            break;
                        case 1:
                            ArrayUtils.n(sb, SafeParcelReader.d(parcel, X));
                            break;
                        case 2:
                            ArrayUtils.m(sb, SafeParcelReader.w(parcel, X));
                            break;
                        case 3:
                            ArrayUtils.k(sb, SafeParcelReader.o(parcel, X));
                            break;
                        case 4:
                            ArrayUtils.j(sb, SafeParcelReader.l(parcel, X));
                            break;
                        case 5:
                            ArrayUtils.n(sb, SafeParcelReader.b(parcel, X));
                            break;
                        case 6:
                            ArrayUtils.o(sb, SafeParcelReader.e(parcel, X));
                            break;
                        case 7:
                            ArrayUtils.p(sb, SafeParcelReader.H(parcel, X));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] z2 = SafeParcelReader.z(parcel, X);
                            int length = z2.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                z2[i2].setDataPosition(0);
                                s0(sb, field.t2(), z2[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append(C6566gU0.g);
                } else {
                    switch (field.Y0) {
                        case 0:
                            sb.append(SafeParcelReader.Z(parcel, X));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.c(parcel, X));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.c0(parcel, X));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.V(parcel, X));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.T(parcel, X));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.a(parcel, X));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.P(parcel, X));
                            break;
                        case 7:
                            String G = SafeParcelReader.G(parcel, X);
                            sb.append(AbstractC4253Sp2.b.x1);
                            sb.append(JsonUtils.b(G));
                            sb.append(AbstractC4253Sp2.b.x1);
                            break;
                        case 8:
                            byte[] h = SafeParcelReader.h(parcel, X);
                            sb.append(AbstractC4253Sp2.b.x1);
                            sb.append(Base64Utils.d(h));
                            sb.append(AbstractC4253Sp2.b.x1);
                            break;
                        case 9:
                            byte[] h2 = SafeParcelReader.h(parcel, X);
                            sb.append(AbstractC4253Sp2.b.x1);
                            sb.append(Base64Utils.e(h2));
                            sb.append(AbstractC4253Sp2.b.x1);
                            break;
                        case 10:
                            Bundle g2 = SafeParcelReader.g(parcel, X);
                            Set<String> keySet = g2.keySet();
                            sb.append("{");
                            boolean z3 = true;
                            for (String str2 : keySet) {
                                if (!z3) {
                                    sb.append(",");
                                }
                                sb.append(AbstractC4253Sp2.b.x1);
                                sb.append(str2);
                                sb.append("\":\"");
                                sb.append(JsonUtils.b(g2.getString(str2)));
                                sb.append(AbstractC4253Sp2.b.x1);
                                z3 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel y = SafeParcelReader.y(parcel, X);
                            y.setDataPosition(0);
                            s0(sb, field.t2(), y);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == i0) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(i0);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @InterfaceC5670cr1
    public final String toString() {
        Preconditions.s(this.Y0, "Cannot convert to JSON on client side.");
        Parcel m0 = m0();
        m0.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        s0(sb, (Map) Preconditions.r(this.Y0.B0((String) Preconditions.r(this.Z0))), m0);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        zan zanVar;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.O(parcel, 2, m0(), false);
        int i2 = this.Z;
        if (i2 != 0) {
            if (i2 != 1) {
                zanVar = this.Y0;
            } else {
                zanVar = this.Y0;
            }
        } else {
            zanVar = null;
        }
        SafeParcelWriter.S(parcel, 3, zanVar, i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.X = 1;
        Parcel obtain = Parcel.obtain();
        this.Y = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.Z = 1;
        this.Y0 = (zan) Preconditions.r(zanVar);
        this.Z0 = (String) Preconditions.r(str);
        this.a1 = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.X = 1;
        this.Y = Parcel.obtain();
        this.Z = 0;
        this.Y0 = (zan) Preconditions.r(zanVar);
        this.Z0 = (String) Preconditions.r(str);
        this.a1 = 0;
    }
}
