package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC4253Sp2;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    @ShowFirstParty
    /* loaded from: classes2.dex */
    public interface FieldConverter<I, O> {
        @InterfaceC11300zs1
        O a0(@InterfaceC5670cr1 I i);

        int d();

        int f();

        @InterfaceC5670cr1
        I k(@InterfaceC5670cr1 O o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5670cr1
    public static final <O, I> I w(@InterfaceC5670cr1 Field<I, O> field, @InterfaceC11300zs1 Object obj) {
        if (field.f1 != null) {
            return field.l2(obj);
        }
        return obj;
    }

    public static final void y(StringBuilder sb, Field field, Object obj) {
        int i = field.Y;
        if (i != 11) {
            if (i == 7) {
                sb.append(AbstractC4253Sp2.b.x1);
                sb.append(JsonUtils.b((String) obj));
                sb.append(AbstractC4253Sp2.b.x1);
                return;
            }
            sb.append(obj);
            return;
        }
        Class<? extends FastJsonResponse> cls = field.c1;
        Preconditions.r(cls);
        sb.append(cls.cast(obj).toString());
    }

    public static final <O> void z(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    public final <O> void A(@InterfaceC5670cr1 Field<BigDecimal, O> field, @InterfaceC11300zs1 BigDecimal bigDecimal) {
        if (field.f1 != null) {
            x(field, bigDecimal);
        } else {
            B(field, field.a1, bigDecimal);
        }
    }

    public void B(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final <O> void C(@InterfaceC5670cr1 Field<ArrayList<BigDecimal>, O> field, @InterfaceC11300zs1 ArrayList<BigDecimal> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            D(field, field.a1, arrayList);
        }
    }

    public void D(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final <O> void E(@InterfaceC5670cr1 Field<BigInteger, O> field, @InterfaceC11300zs1 BigInteger bigInteger) {
        if (field.f1 != null) {
            x(field, bigInteger);
        } else {
            I(field, field.a1, bigInteger);
        }
    }

    public void I(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final <O> void J(@InterfaceC5670cr1 Field<ArrayList<BigInteger>, O> field, @InterfaceC11300zs1 ArrayList<BigInteger> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            K(field, field.a1, arrayList);
        }
    }

    public void K(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final <O> void L(@InterfaceC5670cr1 Field<Boolean, O> field, boolean z) {
        if (field.f1 != null) {
            x(field, Boolean.valueOf(z));
        } else {
            h(field, field.a1, z);
        }
    }

    public final <O> void N(@InterfaceC5670cr1 Field<ArrayList<Boolean>, O> field, @InterfaceC11300zs1 ArrayList<Boolean> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            O(field, field.a1, arrayList);
        }
    }

    public void O(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final <O> void P(@InterfaceC5670cr1 Field<byte[], O> field, @InterfaceC11300zs1 byte[] bArr) {
        if (field.f1 != null) {
            x(field, bArr);
        } else {
            k(field, field.a1, bArr);
        }
    }

    public final <O> void R(@InterfaceC5670cr1 Field<Double, O> field, double d) {
        if (field.f1 != null) {
            x(field, Double.valueOf(d));
        } else {
            S(field, field.a1, d);
        }
    }

    public void S(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final <O> void T(@InterfaceC5670cr1 Field<ArrayList<Double>, O> field, @InterfaceC11300zs1 ArrayList<Double> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            W(field, field.a1, arrayList);
        }
    }

    public void W(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final <O> void X(@InterfaceC5670cr1 Field<Float, O> field, float f) {
        if (field.f1 != null) {
            x(field, Float.valueOf(f));
        } else {
            Y(field, field.a1, f);
        }
    }

    public void Y(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final <O> void Z(@InterfaceC5670cr1 Field<ArrayList<Float>, O> field, @InterfaceC11300zs1 ArrayList<Float> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            a0(field, field.a1, arrayList);
        }
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void a(@InterfaceC5670cr1 Field field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public void a0(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void b(@InterfaceC5670cr1 Field field, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> c();

    public final <O> void c0(@InterfaceC5670cr1 Field<Integer, O> field, int i) {
        if (field.f1 != null) {
            x(field, Integer.valueOf(i));
        } else {
            m(field, field.a1, i);
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public Object d(@InterfaceC5670cr1 Field field) {
        boolean z;
        String str = field.a1;
        if (field.c1 != null) {
            if (e(str) == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.z(z, "Concrete field shouldn't be value object: %s", field.a1);
            try {
                char upperCase = Character.toUpperCase(str.charAt(0));
                String substring = str.substring(1);
                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                sb.append("get");
                sb.append(upperCase);
                sb.append(substring);
                return getClass().getMethod(sb.toString(), null).invoke(this, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return e(str);
    }

    public final <O> void d0(@InterfaceC5670cr1 Field<ArrayList<Integer>, O> field, @InterfaceC11300zs1 ArrayList<Integer> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            e0(field, field.a1, arrayList);
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public abstract Object e(@InterfaceC5670cr1 String str);

    public void e0(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    @KeepForSdk
    public boolean f(@InterfaceC5670cr1 Field field) {
        if (field.Y0 == 11) {
            if (field.Z0) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return g(field.a1);
    }

    public final <O> void f0(@InterfaceC5670cr1 Field<Long, O> field, long j) {
        if (field.f1 != null) {
            x(field, Long.valueOf(j));
        } else {
            n(field, field.a1, j);
        }
    }

    @KeepForSdk
    public abstract boolean g(@InterfaceC5670cr1 String str);

    public final <O> void g0(@InterfaceC5670cr1 Field<ArrayList<Long>, O> field, @InterfaceC11300zs1 ArrayList<Long> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            h0(field, field.a1, arrayList);
        }
    }

    @KeepForSdk
    public void h(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void h0(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    @KeepForSdk
    public void k(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void m(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void n(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void o(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void q(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void s(@InterfaceC5670cr1 Field<?, ?> field, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public final <O> void t(@InterfaceC5670cr1 Field<String, O> field, @InterfaceC11300zs1 String str) {
        if (field.f1 != null) {
            x(field, str);
        } else {
            o(field, field.a1, str);
        }
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> c = c();
        StringBuilder sb = new StringBuilder(100);
        for (String str : c.keySet()) {
            Field<?, ?> field = c.get(str);
            if (f(field)) {
                Object w = w(field, d(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append(AbstractC4253Sp2.b.x1);
                sb.append(str);
                sb.append("\":");
                if (w == null) {
                    sb.append("null");
                } else {
                    switch (field.Y0) {
                        case 8:
                            sb.append(AbstractC4253Sp2.b.x1);
                            sb.append(Base64Utils.d((byte[]) w));
                            sb.append(AbstractC4253Sp2.b.x1);
                            continue;
                        case 9:
                            sb.append(AbstractC4253Sp2.b.x1);
                            sb.append(Base64Utils.e((byte[]) w));
                            sb.append(AbstractC4253Sp2.b.x1);
                            continue;
                        case 10:
                            MapUtils.a(sb, (HashMap) w);
                            continue;
                        default:
                            if (field.Z) {
                                ArrayList arrayList = (ArrayList) w;
                                sb.append(C6566gU0.f);
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        y(sb, field, obj);
                                    }
                                }
                                sb.append(C6566gU0.g);
                                break;
                            } else {
                                y(sb, field, w);
                                continue;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final <O> void u(@InterfaceC5670cr1 Field<Map<String, String>, O> field, @InterfaceC11300zs1 Map<String, String> map) {
        if (field.f1 != null) {
            x(field, map);
        } else {
            q(field, field.a1, map);
        }
    }

    public final <O> void v(@InterfaceC5670cr1 Field<ArrayList<String>, O> field, @InterfaceC11300zs1 ArrayList<String> arrayList) {
        if (field.f1 != null) {
            x(field, arrayList);
        } else {
            s(field, field.a1, arrayList);
        }
    }

    public final <I, O> void x(Field<I, O> field, @InterfaceC11300zs1 I i) {
        String str = field.a1;
        O i2 = field.i2(i);
        int i3 = field.Y0;
        switch (i3) {
            case 0:
                if (i2 != null) {
                    m(field, str, ((Integer) i2).intValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 1:
                I(field, str, (BigInteger) i2);
                return;
            case 2:
                if (i2 != null) {
                    n(field, str, ((Long) i2).longValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 3:
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            case 4:
                if (i2 != null) {
                    S(field, str, ((Double) i2).doubleValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 5:
                B(field, str, (BigDecimal) i2);
                return;
            case 6:
                if (i2 != null) {
                    h(field, str, ((Boolean) i2).booleanValue());
                    return;
                } else {
                    z(str);
                    return;
                }
            case 7:
                o(field, str, (String) i2);
                return;
            case 8:
            case 9:
                if (i2 != null) {
                    k(field, str, (byte[]) i2);
                    return;
                } else {
                    z(str);
                    return;
                }
        }
    }

    @VisibleForTesting
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        public final int X;
        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        public final int Y;
        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        public final int Y0;
        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        public final boolean Z;
        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        public final boolean Z0;
        @InterfaceC5670cr1
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        public final String a1;
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        public final int b1;
        @InterfaceC11300zs1
        public final Class<? extends FastJsonResponse> c1;
        @InterfaceC11300zs1
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        public final String d1;
        public zan e1;
        @InterfaceC11300zs1
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        public FieldConverter<I, O> f1;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @InterfaceC11300zs1 @SafeParcelable.Param(id = 8) String str2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.X = i;
            this.Y = i2;
            this.Z = z;
            this.Y0 = i3;
            this.Z0 = z2;
            this.a1 = str;
            this.b1 = i4;
            if (str2 == null) {
                this.c1 = null;
                this.d1 = null;
            } else {
                this.c1 = SafeParcelResponse.class;
                this.d1 = str2;
            }
            if (zaaVar == null) {
                this.f1 = null;
            } else {
                this.f1 = (FieldConverter<I, O>) zaaVar.B0();
            }
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<Boolean, Boolean> B0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> E0(@InterfaceC5670cr1 String str, int i, @InterfaceC5670cr1 Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> G0(@InterfaceC5670cr1 String str, int i, @InterfaceC5670cr1 Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<Double, Double> H0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<Float, Float> I0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        @VisibleForTesting
        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<Integer, Integer> O0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<Long, Long> S0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<String, String> U0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> V0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> Z0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        @VisibleForTesting
        @InterfaceC5670cr1
        @KeepForSdk
        public static Field<byte[], byte[]> m0(@InterfaceC5670cr1 String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public static Field x1(@InterfaceC5670cr1 String str, int i, @InterfaceC5670cr1 FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.d();
            fieldConverter.f();
            return new Field(7, z, 0, false, str, i, null, fieldConverter);
        }

        @InterfaceC11300zs1
        public final com.google.android.gms.common.server.converter.zaa I1() {
            FieldConverter<I, O> fieldConverter = this.f1;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.m0(fieldConverter);
        }

        @InterfaceC5670cr1
        public final Field<I, O> M1() {
            return new Field<>(this.X, this.Y, this.Z, this.Y0, this.Z0, this.a1, this.b1, this.d1, I1());
        }

        public final void P2(zan zanVar) {
            this.e1 = zanVar;
        }

        @InterfaceC5670cr1
        public final FastJsonResponse c2() throws InstantiationException, IllegalAccessException {
            Preconditions.r(this.c1);
            Class<? extends FastJsonResponse> cls = this.c1;
            if (cls == SafeParcelResponse.class) {
                Preconditions.r(this.d1);
                Preconditions.s(this.e1, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new SafeParcelResponse(this.e1, this.d1);
            }
            return cls.newInstance();
        }

        public final boolean d3() {
            return this.f1 != null;
        }

        @KeepForSdk
        public int e1() {
            return this.b1;
        }

        @InterfaceC5670cr1
        public final O i2(@InterfaceC11300zs1 I i) {
            Preconditions.r(this.f1);
            return (O) Preconditions.r(this.f1.a0(i));
        }

        @InterfaceC5670cr1
        public final I l2(@InterfaceC5670cr1 O o2) {
            Preconditions.r(this.f1);
            return this.f1.k(o2);
        }

        @InterfaceC11300zs1
        public final String p2() {
            String str = this.d1;
            if (str == null) {
                return null;
            }
            return str;
        }

        @InterfaceC5670cr1
        public final Map<String, Field<?, ?>> t2() {
            Preconditions.r(this.d1);
            Preconditions.r(this.e1);
            return (Map) Preconditions.r(this.e1.B0(this.d1));
        }

        @InterfaceC5670cr1
        public final String toString() {
            Objects.ToStringHelper a = Objects.d(this).a("versionCode", Integer.valueOf(this.X)).a("typeIn", Integer.valueOf(this.Y)).a("typeInArray", Boolean.valueOf(this.Z)).a("typeOut", Integer.valueOf(this.Y0)).a("typeOutArray", Boolean.valueOf(this.Z0)).a("outputFieldName", this.a1).a("safeParcelFieldId", Integer.valueOf(this.b1)).a("concreteTypeName", p2());
            Class<? extends FastJsonResponse> cls = this.c1;
            if (cls != null) {
                a.a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.f1;
            if (fieldConverter != null) {
                a.a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return a.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            int a = SafeParcelWriter.a(parcel);
            SafeParcelWriter.F(parcel, 1, this.X);
            SafeParcelWriter.F(parcel, 2, this.Y);
            SafeParcelWriter.g(parcel, 3, this.Z);
            SafeParcelWriter.F(parcel, 4, this.Y0);
            SafeParcelWriter.g(parcel, 5, this.Z0);
            SafeParcelWriter.Y(parcel, 6, this.a1, false);
            SafeParcelWriter.F(parcel, 7, e1());
            SafeParcelWriter.Y(parcel, 8, p2(), false);
            SafeParcelWriter.S(parcel, 9, I1(), i, false);
            SafeParcelWriter.b(parcel, a);
        }

        public Field(int i, boolean z, int i2, boolean z2, @InterfaceC5670cr1 String str, int i3, @InterfaceC11300zs1 Class<? extends FastJsonResponse> cls, @InterfaceC11300zs1 FieldConverter<I, O> fieldConverter) {
            this.X = 1;
            this.Y = i;
            this.Z = z;
            this.Y0 = i2;
            this.Z0 = z2;
            this.a1 = str;
            this.b1 = i3;
            this.c1 = cls;
            if (cls == null) {
                this.d1 = null;
            } else {
                this.d1 = cls.getCanonicalName();
            }
            this.f1 = fieldConverter;
        }
    }
}
