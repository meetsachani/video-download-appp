package o;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC8303na2({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1208#2,2:125\n1236#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
/* loaded from: classes3.dex */
public final class NA {
    @NotNull
    public static final a Y;
    @NotNull
    public static final EY0<Map<Integer, NA>> Z;
    public static final /* synthetic */ NA[] s1;
    public static final /* synthetic */ InterfaceC3127Hd0 t1;
    public final int X;
    public static final NA Y0 = new NA("UNDEFINED", 0, -1);
    public static final NA Z0 = new NA("LEFT_TO_RIGHT", 1, 0);
    public static final NA a1 = new NA("RIGHT_TO_LEFT", 2, 1);
    public static final NA b1 = new NA("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final NA c1 = new NA("EUROPEAN_NUMBER", 4, 3);
    public static final NA d1 = new NA("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final NA e1 = new NA("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final NA f1 = new NA("ARABIC_NUMBER", 7, 6);
    public static final NA g1 = new NA("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final NA h1 = new NA("NONSPACING_MARK", 9, 8);
    public static final NA i1 = new NA("BOUNDARY_NEUTRAL", 10, 9);
    public static final NA j1 = new NA("PARAGRAPH_SEPARATOR", 11, 10);
    public static final NA k1 = new NA("SEGMENT_SEPARATOR", 12, 11);
    public static final NA l1 = new NA("WHITESPACE", 13, 12);
    public static final NA m1 = new NA("OTHER_NEUTRALS", 14, 13);
    public static final NA n1 = new NA("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final NA o1 = new NA("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final NA p1 = new NA("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final NA q1 = new NA("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final NA r1 = new NA("POP_DIRECTIONAL_FORMAT", 19, 18);

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final Map<Integer, NA> a() {
            return (Map) NA.Z.getValue();
        }

        @NotNull
        public final NA b(int i) {
            NA na = a().get(Integer.valueOf(i));
            if (na != null) {
                return na;
            }
            throw new IllegalArgumentException("Directionality #" + i + " is not defined.");
        }

        public a() {
        }
    }

    static {
        NA[] g = g();
        s1 = g;
        t1 = C3323Jd0.c(g);
        Y = new a(null);
        Z = WY0.b(new FA0() { // from class: o.MA
            @Override // o.FA0
            public final Object invoke() {
                Map i;
                i = NA.i();
                return i;
            }
        });
    }

    public NA(String str, int i, int i2) {
        this.X = i2;
    }

    public static final /* synthetic */ NA[] g() {
        return new NA[]{Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, i1, j1, k1, l1, m1, n1, o1, p1, q1, r1};
    }

    public static final Map i() {
        InterfaceC3127Hd0<NA> j = j();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C8466oF.b0(j, 10)), 16));
        for (Object obj : j) {
            linkedHashMap.put(Integer.valueOf(((NA) obj).X), obj);
        }
        return linkedHashMap;
    }

    @NotNull
    public static InterfaceC3127Hd0<NA> j() {
        return t1;
    }

    public static NA valueOf(String str) {
        return (NA) Enum.valueOf(NA.class, str);
    }

    public static NA[] values() {
        return (NA[]) s1.clone();
    }

    public final int l() {
        return this.X;
    }
}
