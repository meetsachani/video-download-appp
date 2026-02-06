package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC10668xG1;
import o.CG1;

/* loaded from: classes.dex */
public final class DG1 implements B12<AbstractC10668xG1> {
    public static final DG1 a = new DG1();
    public static final String b = "preferences_pb";

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CG1.f.b.values().length];
            iArr[CG1.f.b.BOOLEAN.ordinal()] = 1;
            iArr[CG1.f.b.FLOAT.ordinal()] = 2;
            iArr[CG1.f.b.DOUBLE.ordinal()] = 3;
            iArr[CG1.f.b.INTEGER.ordinal()] = 4;
            iArr[CG1.f.b.LONG.ordinal()] = 5;
            iArr[CG1.f.b.STRING.ordinal()] = 6;
            iArr[CG1.f.b.STRING_SET.ordinal()] = 7;
            iArr[CG1.f.b.VALUE_NOT_SET.ordinal()] = 8;
            a = iArr;
        }
    }

    @Override // o.B12
    public Object b(InputStream inputStream, HM<? super AbstractC10668xG1> hm) throws IOException, BQ {
        CG1.b a2 = BG1.a.a(inputStream);
        C2972Fn1 c = C10911yG1.c(new AbstractC10668xG1.b[0]);
        Map<String, CG1.f> m1 = a2.m1();
        C6562gT0.o(m1, "preferencesProto.preferencesMap");
        for (Map.Entry<String, CG1.f> entry : m1.entrySet()) {
            String key = entry.getKey();
            CG1.f value = entry.getValue();
            DG1 dg1 = a;
            C6562gT0.o(key, "name");
            C6562gT0.o(value, "value");
            dg1.c(key, value, c);
        }
        return c.e();
    }

    public final void c(String str, CG1.f fVar, C2972Fn1 c2972Fn1) {
        int i;
        CG1.f.b J = fVar.J();
        if (J == null) {
            i = -1;
        } else {
            i = a.a[J.ordinal()];
        }
        switch (i) {
            case -1:
                throw new BQ("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C3865Oq1();
            case 1:
                c2972Fn1.o(C11154zG1.a(str), Boolean.valueOf(fVar.D0()));
                return;
            case 2:
                c2972Fn1.o(C11154zG1.c(str), Float.valueOf(fVar.T()));
                return;
            case 3:
                c2972Fn1.o(C11154zG1.b(str), Double.valueOf(fVar.v0()));
                return;
            case 4:
                c2972Fn1.o(C11154zG1.d(str), Integer.valueOf(fVar.s0()));
                return;
            case 5:
                c2972Fn1.o(C11154zG1.e(str), Long.valueOf(fVar.s()));
                return;
            case 6:
                AbstractC10668xG1.a<String> f = C11154zG1.f(str);
                String string = fVar.getString();
                C6562gT0.o(string, "value.string");
                c2972Fn1.o(f, string);
                return;
            case 7:
                AbstractC10668xG1.a<Set<String>> g = C11154zG1.g(str);
                List<String> a1 = fVar.t0().a1();
                C6562gT0.o(a1, "value.stringSet.stringsList");
                c2972Fn1.o(g, C10662xF.d6(a1));
                return;
            case 8:
                throw new BQ("Value not set.", null, 2, null);
        }
    }

    @Override // o.B12
    /* renamed from: d */
    public AbstractC10668xG1 r() {
        return C10911yG1.b();
    }

    public final String e() {
        return b;
    }

    public final CG1.f f(Object obj) {
        if (obj instanceof Boolean) {
            CG1.f build = CG1.f.b3().h2(((Boolean) obj).booleanValue()).build();
            C6562gT0.o(build, "newBuilder().setBoolean(value).build()");
            return build;
        } else if (obj instanceof Float) {
            CG1.f build2 = CG1.f.b3().k2(((Number) obj).floatValue()).build();
            C6562gT0.o(build2, "newBuilder().setFloat(value).build()");
            return build2;
        } else if (obj instanceof Double) {
            CG1.f build3 = CG1.f.b3().j2(((Number) obj).doubleValue()).build();
            C6562gT0.o(build3, "newBuilder().setDouble(value).build()");
            return build3;
        } else if (obj instanceof Integer) {
            CG1.f build4 = CG1.f.b3().m2(((Number) obj).intValue()).build();
            C6562gT0.o(build4, "newBuilder().setInteger(value).build()");
            return build4;
        } else if (obj instanceof Long) {
            CG1.f build5 = CG1.f.b3().n2(((Number) obj).longValue()).build();
            C6562gT0.o(build5, "newBuilder().setLong(value).build()");
            return build5;
        } else if (obj instanceof String) {
            CG1.f build6 = CG1.f.b3().o2((String) obj).build();
            C6562gT0.o(build6, "newBuilder().setString(value).build()");
            return build6;
        } else if (obj instanceof Set) {
            CG1.f build7 = CG1.f.b3().q2(CG1.d.K2().Y1((Set) obj)).build();
            C6562gT0.o(build7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return build7;
        } else {
            throw new IllegalStateException(C6562gT0.C("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
    }

    @Override // o.B12
    /* renamed from: g */
    public Object a(AbstractC10668xG1 abstractC10668xG1, OutputStream outputStream, HM<? super C7458kA2> hm) throws IOException, BQ {
        Map<AbstractC10668xG1.a<?>, Object> a2 = abstractC10668xG1.a();
        CG1.b.a E2 = CG1.b.E2();
        for (Map.Entry<AbstractC10668xG1.a<?>, Object> entry : a2.entrySet()) {
            E2.a2(entry.getKey().a(), f(entry.getValue()));
        }
        E2.build().writeTo(outputStream);
        return C7458kA2.a;
    }
}
