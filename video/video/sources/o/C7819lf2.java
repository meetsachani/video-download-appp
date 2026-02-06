package o;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:146\n126#1,2:159\n119#1,2:168\n121#1,4:183\n126#1,2:190\n1#2:130\n1#2:156\n1#2:187\n1#2:211\n1583#3,11:133\n1878#3,2:144\n1880#3:157\n1594#3:158\n774#3:161\n865#3,2:162\n1563#3:164\n1634#3,3:165\n1583#3,11:170\n1878#3,2:181\n1880#3:188\n1594#3:189\n1583#3,11:198\n1878#3,2:209\n1880#3:212\n1594#3:213\n158#4,6:150\n158#4,6:192\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:146,4\n42#1:159,2\n83#1:168,2\n83#1:183,4\n83#1:190,2\n42#1:156\n83#1:187\n120#1:211\n42#1:133,11\n42#1:144,2\n42#1:157\n42#1:158\n79#1:161\n79#1:162,2\n80#1:164\n80#1:165,3\n83#1:170,11\n83#1:181,2\n83#1:188\n83#1:189\n120#1:198,11\n120#1:209,2\n120#1:212\n120#1:213\n43#1:150,6\n107#1:192,6\n*E\n"})
/* renamed from: o.lf2 */
/* loaded from: classes3.dex */
public class C7819lf2 extends C6849hf2 {
    public static final HA0<String, String> j(final String str) {
        if (str.length() == 0) {
            return new HA0() { // from class: o.jf2
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    String k;
                    k = C7819lf2.k((String) obj);
                    return k;
                }
            };
        }
        return new HA0() { // from class: o.kf2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                String l;
                l = C7819lf2.l(str, (String) obj);
                return l;
            }
        };
    }

    public static final String k(String str) {
        C6562gT0.p(str, "line");
        return str;
    }

    public static final String l(String str, String str2) {
        C6562gT0.p(str2, "line");
        return str + str2;
    }

    public static final int m(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!BB.r(str.charAt(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    @NotNull
    public static final String n(@NotNull String str, @NotNull final String str2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "indent");
        return C6695h12.F1(C6695h12.L1(C10763xf2.d4(str), new HA0() { // from class: o.if2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                String p;
                p = C7819lf2.p(str2, (String) obj);
                return p;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String o(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return n(str, str2);
    }

    public static final String p(String str, String str2) {
        C6562gT0.p(str2, "it");
        if (C10763xf2.O3(str2)) {
            if (str2.length() < str.length()) {
                return str;
            }
            return str2;
        }
        return str + str2;
    }

    public static final String q(List<String> list, int i, HA0<? super String, String> ha0, HA0<? super String, String> ha02) {
        String invoke;
        int J = C8222nF.J(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == J) && C10763xf2.O3(str)) {
                str = null;
            } else {
                String invoke2 = ha02.invoke(str);
                if (invoke2 != null && (invoke = ha0.invoke(invoke2)) != null) {
                    str = invoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        return ((StringBuilder) C10662xF.n3(arrayList, new StringBuilder(i), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    @NotNull
    public static final String r(@NotNull String str, @NotNull String str2) {
        int i;
        String invoke;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "newIndent");
        List<String> e4 = C10763xf2.e4(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : e4) {
            if (!C10763xf2.O3((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C8466oF.b0(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(m(str3)));
        }
        Integer num = (Integer) C10662xF.k4(arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * e4.size());
        HA0<String, String> j = j(str2);
        int J = C8222nF.J(e4);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : e4) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C8222nF.Z();
            }
            String str4 = (String) obj2;
            if ((i2 == 0 || i2 == J) && C10763xf2.O3(str4)) {
                str4 = null;
            } else {
                String d7 = C2832Ef2.d7(str4, i);
                if (d7 != null && (invoke = j.invoke(d7)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i2 = i3;
        }
        return ((StringBuilder) C10662xF.n3(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static /* synthetic */ String s(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return r(str, str2);
    }

    @NotNull
    public static final String t(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4;
        String invoke;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "newIndent");
        C6562gT0.p(str3, "marginPrefix");
        if (!C10763xf2.O3(str3)) {
            List<String> e4 = C10763xf2.e4(str);
            int length = str.length() + (str2.length() * e4.size());
            HA0<String, String> j = j(str2);
            int J = C8222nF.J(e4);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : e4) {
                int i2 = i + 1;
                if (i < 0) {
                    C8222nF.Z();
                }
                String str5 = (String) obj;
                String str6 = null;
                if ((i == 0 || i == J) && C10763xf2.O3(str5)) {
                    str4 = str3;
                    str5 = null;
                } else {
                    int length2 = str5.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            if (!BB.r(str5.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 == -1) {
                        str4 = str3;
                    } else {
                        int i4 = i3;
                        str4 = str3;
                        if (C9545sf2.I2(str5, str4, i4, false, 4, null)) {
                            C6562gT0.n(str5, "null cannot be cast to non-null type java.lang.String");
                            str6 = str5.substring(str4.length() + i4);
                            C6562gT0.o(str6, "substring(...)");
                        }
                    }
                    if (str6 != null && (invoke = j.invoke(str6)) != null) {
                        str5 = invoke;
                    }
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
                i = i2;
                str3 = str4;
            }
            return ((StringBuilder) C10662xF.n3(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static /* synthetic */ String u(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return t(str, str2, str3);
    }

    @InterfaceC6307fT0
    @NotNull
    public static String v(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return r(str, "");
    }

    @InterfaceC6307fT0
    @NotNull
    public static final String w(@NotNull String str, @NotNull String str2) {
        C6562gT0.p(str, "<this>");
        C6562gT0.p(str2, "marginPrefix");
        return t(str, "", str2);
    }

    public static /* synthetic */ String x(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return w(str, str2);
    }
}
