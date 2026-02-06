package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* renamed from: o.e42  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5966e42<T> implements AU<T> {
    public final VA0<T, HM<? super Boolean>, Object> a;
    public final XA0<C6707h42, T, HM<? super T>, Object> b;
    public final Context c;
    public final String d;
    public final EY0 e;
    public final Set<String> f;

    @FV(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.e42$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<T, HM<? super Boolean>, Object> {
        public int Z0;

        public a(HM<? super a> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                return C10557wp.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(T t, HM<? super Boolean> hm) {
            return ((a) t(t, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new a(hm);
        }
    }

    @FV(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.e42$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<T, HM<? super Boolean>, Object> {
        public int Z0;

        public b(HM<? super b> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                return C10557wp.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(T t, HM<? super Boolean> hm) {
            return ((b) t(t, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new b(hm);
        }
    }

    @FV(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.e42$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC4225Si2 implements VA0<T, HM<? super Boolean>, Object> {
        public int Z0;

        public c(HM<? super c> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                return C10557wp.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(T t, HM<? super Boolean> hm) {
            return ((c) t(t, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new c(hm);
        }
    }

    /* renamed from: o.e42$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC8052mY0 implements FA0<SharedPreferences> {
        public final /* synthetic */ Context X;
        public final /* synthetic */ String Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String str) {
            super(0);
            this.X = context;
            this.Y = str;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.X.getSharedPreferences(this.Y, 0);
            C6562gT0.o(sharedPreferences, "context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* renamed from: o.e42$e */
    /* loaded from: classes.dex */
    public static final class e {
        public static final e a = new e();

        @InterfaceC9511sW0
        public static final boolean a(Context context, String str) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "name");
            return context.deleteSharedPreferences(str);
        }
    }

    @FV(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", i = {0}, l = {147}, m = "shouldMigrate", n = {"this"}, s = {"L$0"})
    /* renamed from: o.e42$f */
    /* loaded from: classes.dex */
    public static final class f extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public final /* synthetic */ C5966e42<T> a1;
        public int b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C5966e42<T> c5966e42, HM<? super f> hm) {
            super(hm);
            this.a1 = c5966e42;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.Z0 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return this.a1.a(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5966e42(Context context, String str, Set<String> set, XA0<? super C6707h42, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        this(context, str, set, null, xa0, 8, null);
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "sharedPreferencesName");
        C6562gT0.p(set, "keysToMigrate");
        C6562gT0.p(xa0, "migrate");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r5.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // o.AU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(T t, HM<? super Boolean> hm) {
        f fVar;
        Object obj;
        int i;
        C5966e42<T> c5966e42;
        if (hm instanceof f) {
            fVar = (f) hm;
            int i2 = fVar.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.b1 = i2 - Integer.MIN_VALUE;
                obj = fVar.Z0;
                Object l = C7289jT0.l();
                i = fVar.b1;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        c5966e42 = (C5966e42) fVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    VA0<T, HM<? super Boolean>, Object> va0 = this.a;
                    fVar.Y0 = this;
                    fVar.b1 = 1;
                    obj = va0.i(t, fVar);
                    if (obj == l) {
                        return l;
                    }
                    c5966e42 = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return C10557wp.a(false);
                }
                Set<String> set = c5966e42.f;
                if (set == null) {
                    Map<String, ?> all = c5966e42.e().getAll();
                    C6562gT0.o(all, "sharedPrefs.all");
                } else {
                    SharedPreferences e2 = c5966e42.e();
                    if (set == null || !set.isEmpty()) {
                        for (String str : set) {
                            if (C10557wp.a(e2.contains(str)).booleanValue()) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return C10557wp.a(z);
                }
            }
        }
        fVar = new f(this, hm);
        obj = fVar.Z0;
        Object l2 = C7289jT0.l();
        i = fVar.b1;
        boolean z2 = true;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // o.AU
    public Object b(HM<? super C7458kA2> hm) throws IOException {
        C7458kA2 c7458kA2;
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set<String> set = this.f;
        if (set == null) {
            edit.clear();
        } else {
            for (String str2 : set) {
                edit.remove(str2);
            }
        }
        if (edit.commit()) {
            if (e().getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
                d(context, str);
            }
            Set<String> set2 = this.f;
            if (set2 == null) {
                c7458kA2 = null;
            } else {
                set2.clear();
                c7458kA2 = C7458kA2.a;
            }
            if (c7458kA2 == C7289jT0.l()) {
                return c7458kA2;
            }
            return C7458kA2.a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    @Override // o.AU
    public Object c(T t, HM<? super T> hm) {
        return this.b.P(new C6707h42(e(), this.f), t, hm);
    }

    public final void d(Context context, String str) {
        e eVar = e.a;
        if (e.a(context, str)) {
            return;
        }
        throw new IOException(C6562gT0.C("Unable to delete SharedPreferences: ", str));
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.e.getValue();
    }

    public final File f(File file) {
        return new File(C6562gT0.C(file.getPath(), ".bak"));
    }

    public final File g(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), C6562gT0.C(str, androidx.appcompat.widget.b.y));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5966e42(Context context, String str, XA0<? super C6707h42, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        this(context, str, null, null, xa0, 12, null);
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "sharedPreferencesName");
        C6562gT0.p(xa0, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5966e42(FA0<? extends SharedPreferences> fa0, Set<String> set, XA0<? super C6707h42, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        this(fa0, set, (VA0) null, xa0, 4, (C9516sY) null);
        C6562gT0.p(fa0, "produceSharedPreferences");
        C6562gT0.p(set, "keysToMigrate");
        C6562gT0.p(xa0, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5966e42(FA0<? extends SharedPreferences> fa0, XA0<? super C6707h42, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        this(fa0, (Set) null, (VA0) null, xa0, 6, (C9516sY) null);
        C6562gT0.p(fa0, "produceSharedPreferences");
        C6562gT0.p(xa0, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5966e42(FA0<? extends SharedPreferences> fa0, Set<String> set, VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, XA0<? super C6707h42, ? super T, ? super HM<? super T>, ? extends Object> xa0, Context context, String str) {
        this.a = va0;
        this.b = xa0;
        this.c = context;
        this.d = str;
        this.e = WY0.b(fa0);
        this.f = set == C6464g42.a() ? null : C10662xF.c6(set);
    }

    public /* synthetic */ C5966e42(FA0 fa0, Set set, VA0 va0, XA0 xa0, Context context, String str, int i, C9516sY c9516sY) {
        this(fa0, set, (i & 4) != 0 ? new a(null) : va0, xa0, context, str);
    }

    public /* synthetic */ C5966e42(FA0 fa0, Set set, VA0 va0, XA0 xa0, int i, C9516sY c9516sY) {
        this(fa0, (i & 2) != 0 ? C6464g42.a() : set, (i & 4) != 0 ? new b(null) : va0, xa0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5966e42(FA0<? extends SharedPreferences> fa0, Set<String> set, VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, XA0<? super C6707h42, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        this(fa0, set, va0, xa0, (Context) null, (String) null);
        C6562gT0.p(fa0, "produceSharedPreferences");
        C6562gT0.p(set, "keysToMigrate");
        C6562gT0.p(va0, "shouldRunMigration");
        C6562gT0.p(xa0, "migrate");
    }

    public /* synthetic */ C5966e42(Context context, String str, Set set, VA0 va0, XA0 xa0, int i, C9516sY c9516sY) {
        this(context, str, (i & 4) != 0 ? C6464g42.a() : set, (i & 8) != 0 ? new c(null) : va0, xa0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5966e42(Context context, String str, Set<String> set, VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, XA0<? super C6707h42, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        this(new d(context, str), set, va0, xa0, context, str);
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "sharedPreferencesName");
        C6562gT0.p(set, "keysToMigrate");
        C6562gT0.p(va0, "shouldRunMigration");
        C6562gT0.p(xa0, "migrate");
    }
}
