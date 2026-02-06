package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import o.AbstractC10668xG1;

/* renamed from: o.f42  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6209f42 {
    public static final Set<String> a = new LinkedHashSet();

    @FV(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.f42$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4225Si2 implements XA0<C6707h42, AbstractC10668xG1, HM<? super AbstractC10668xG1>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;

        public a(HM<? super a> hm) {
            super(3, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                C6707h42 c6707h42 = (C6707h42) this.a1;
                AbstractC10668xG1 abstractC10668xG1 = (AbstractC10668xG1) this.b1;
                Set<AbstractC10668xG1.a<?>> keySet = abstractC10668xG1.a().keySet();
                ArrayList arrayList = new ArrayList(C8466oF.b0(keySet, 10));
                Iterator<T> it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC10668xG1.a) it.next()).a());
                }
                Map<String, Object> c = c6707h42.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : c.entrySet()) {
                    if (C10557wp.a(!arrayList.contains(entry.getKey())).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C2972Fn1 d = abstractC10668xG1.d();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Boolean) {
                        d.o(C11154zG1.a(str), value);
                    } else if (value instanceof Float) {
                        d.o(C11154zG1.c(str), value);
                    } else if (value instanceof Integer) {
                        d.o(C11154zG1.d(str), value);
                    } else if (value instanceof Long) {
                        d.o(C11154zG1.e(str), value);
                    } else if (value instanceof String) {
                        d.o(C11154zG1.f(str), value);
                    } else if (value instanceof Set) {
                        AbstractC10668xG1.a<Set<String>> g = C11154zG1.g(str);
                        if (value != null) {
                            d.o(g, (Set) value);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                        }
                    } else {
                        continue;
                    }
                }
                return d.e();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(C6707h42 c6707h42, AbstractC10668xG1 abstractC10668xG1, HM<? super AbstractC10668xG1> hm) {
            a aVar = new a(hm);
            aVar.a1 = c6707h42;
            aVar.b1 = abstractC10668xG1;
            return aVar.F(C7458kA2.a);
        }
    }

    @FV(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.f42$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<AbstractC10668xG1, HM<? super Boolean>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ Set<String> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set, HM<? super b> hm) {
            super(2, hm);
            this.b1 = set;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                Set<AbstractC10668xG1.a<?>> keySet = ((AbstractC10668xG1) this.a1).a().keySet();
                ArrayList arrayList = new ArrayList(C8466oF.b0(keySet, 10));
                Iterator<T> it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC10668xG1.a) it.next()).a());
                }
                boolean z = true;
                if (this.b1 != C6209f42.g()) {
                    Set<String> set = this.b1;
                    if (set == null || !set.isEmpty()) {
                        for (String str : set) {
                            if (C10557wp.a(!arrayList.contains(str)).booleanValue()) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                return C10557wp.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AbstractC10668xG1 abstractC10668xG1, HM<? super Boolean> hm) {
            return ((b) t(abstractC10668xG1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.b1, hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    public static final C5966e42<AbstractC10668xG1> a(Context context, String str) {
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "sharedPreferencesName");
        return e(context, str, null, 4, null);
    }

    public static final C5966e42<AbstractC10668xG1> b(Context context, String str, Set<String> set) {
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "sharedPreferencesName");
        C6562gT0.p(set, "keysToMigrate");
        if (set == a) {
            return new C5966e42<>(context, str, null, i(set), h(), 4, null);
        }
        return new C5966e42<>(context, str, set, i(set), h());
    }

    public static final C5966e42<AbstractC10668xG1> c(FA0<? extends SharedPreferences> fa0) {
        C6562gT0.p(fa0, "produceSharedPreferences");
        return f(fa0, null, 2, null);
    }

    public static final C5966e42<AbstractC10668xG1> d(FA0<? extends SharedPreferences> fa0, Set<String> set) {
        C6562gT0.p(fa0, "produceSharedPreferences");
        C6562gT0.p(set, "keysToMigrate");
        if (set == a) {
            return new C5966e42<>(fa0, (Set) null, i(set), h(), 2, (C9516sY) null);
        }
        return new C5966e42<>(fa0, set, i(set), h());
    }

    public static /* synthetic */ C5966e42 e(Context context, String str, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = a;
        }
        return b(context, str, set);
    }

    public static /* synthetic */ C5966e42 f(FA0 fa0, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = a;
        }
        return d(fa0, set);
    }

    public static final Set<String> g() {
        return a;
    }

    public static final XA0<C6707h42, AbstractC10668xG1, HM<? super AbstractC10668xG1>, Object> h() {
        return new a(null);
    }

    public static final VA0<AbstractC10668xG1, HM<? super Boolean>, Object> i(Set<String> set) {
        return new b(set, null);
    }
}
