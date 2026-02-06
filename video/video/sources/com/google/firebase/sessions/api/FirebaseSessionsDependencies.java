package com.google.firebase.sessions.api;

import android.util.Log;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C6143eo1;
import o.C6562gT0;
import o.C7289jT0;
import o.C8683p81;
import o.C9516sY;
import o.HM;
import o.InterfaceC4826Yn1;
import o.InterfaceC5056aJ2;
import o.InterfaceC9511sW0;
import o.RT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class FirebaseSessionsDependencies {
    @NotNull
    public static final String b = "SessionsDependencies";
    @NotNull
    public static final FirebaseSessionsDependencies a = new FirebaseSessionsDependencies();
    public static final Map<SessionSubscriber.Name, Dependency> c = Collections.synchronizedMap(new LinkedHashMap());

    /* loaded from: classes3.dex */
    public static final class Dependency {
        @NotNull
        public final InterfaceC4826Yn1 a;
        @Nullable
        public SessionSubscriber b;

        public Dependency(@NotNull InterfaceC4826Yn1 interfaceC4826Yn1, @Nullable SessionSubscriber sessionSubscriber) {
            C6562gT0.p(interfaceC4826Yn1, "mutex");
            this.a = interfaceC4826Yn1;
            this.b = sessionSubscriber;
        }

        public static /* synthetic */ Dependency d(Dependency dependency, InterfaceC4826Yn1 interfaceC4826Yn1, SessionSubscriber sessionSubscriber, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC4826Yn1 = dependency.a;
            }
            if ((i & 2) != 0) {
                sessionSubscriber = dependency.b;
            }
            return dependency.c(interfaceC4826Yn1, sessionSubscriber);
        }

        @NotNull
        public final InterfaceC4826Yn1 a() {
            return this.a;
        }

        @Nullable
        public final SessionSubscriber b() {
            return this.b;
        }

        @NotNull
        public final Dependency c(@NotNull InterfaceC4826Yn1 interfaceC4826Yn1, @Nullable SessionSubscriber sessionSubscriber) {
            C6562gT0.p(interfaceC4826Yn1, "mutex");
            return new Dependency(interfaceC4826Yn1, sessionSubscriber);
        }

        @NotNull
        public final InterfaceC4826Yn1 e() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Dependency) {
                Dependency dependency = (Dependency) obj;
                return C6562gT0.g(this.a, dependency.a) && C6562gT0.g(this.b, dependency.b);
            }
            return false;
        }

        @Nullable
        public final SessionSubscriber f() {
            return this.b;
        }

        public final void g(@Nullable SessionSubscriber sessionSubscriber) {
            this.b = sessionSubscriber;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.b;
            return hashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        @NotNull
        public String toString() {
            return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
        }

        public /* synthetic */ Dependency(InterfaceC4826Yn1 interfaceC4826Yn1, SessionSubscriber sessionSubscriber, int i, C9516sY c9516sY) {
            this(interfaceC4826Yn1, (i & 2) != 0 ? null : sessionSubscriber);
        }
    }

    private FirebaseSessionsDependencies() {
    }

    @InterfaceC9511sW0
    public static final void e(@NotNull SessionSubscriber sessionSubscriber) {
        C6562gT0.p(sessionSubscriber, "subscriber");
        SessionSubscriber.Name b2 = sessionSubscriber.b();
        Dependency b3 = a.b(b2);
        if (b3.f() != null) {
            Log.d(b, "Subscriber " + b2 + " already registered.");
            return;
        }
        b3.g(sessionSubscriber);
        Log.d(b, "Subscriber " + b2 + " registered.");
        InterfaceC4826Yn1.a.d(b3.e(), null, 1, null);
    }

    public final void a(@NotNull SessionSubscriber.Name name) {
        C6562gT0.p(name, "subscriberName");
        if (name != SessionSubscriber.Name.PERFORMANCE) {
            Map<SessionSubscriber.Name, Dependency> map = c;
            if (map.containsKey(name)) {
                Log.d(b, "Dependency " + name + " already added.");
                return;
            }
            C6562gT0.o(map, "dependencies");
            map.put(name, new Dependency(C6143eo1.a(true), null, 2, null));
            Log.d(b, "Dependency to " + name + " added.");
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    public final Dependency b(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, Dependency> map = c;
        C6562gT0.o(map, "dependencies");
        Dependency dependency = map.get(name);
        if (dependency != null) {
            C6562gT0.o(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please submit an issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull HM<? super Map<SessionSubscriber.Name, ? extends SessionSubscriber>> hm) {
        FirebaseSessionsDependencies$getRegisteredSubscribers$1 firebaseSessionsDependencies$getRegisteredSubscribers$1;
        int i;
        Iterator it;
        LinkedHashMap linkedHashMap;
        if (hm instanceof FirebaseSessionsDependencies$getRegisteredSubscribers$1) {
            firebaseSessionsDependencies$getRegisteredSubscribers$1 = (FirebaseSessionsDependencies$getRegisteredSubscribers$1) hm;
            int i2 = firebaseSessionsDependencies$getRegisteredSubscribers$1.g1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                firebaseSessionsDependencies$getRegisteredSubscribers$1.g1 = i2 - Integer.MIN_VALUE;
                Object obj = firebaseSessionsDependencies$getRegisteredSubscribers$1.e1;
                Object l = C7289jT0.l();
                i = firebaseSessionsDependencies$getRegisteredSubscribers$1.g1;
                if (i == 0) {
                    if (i == 1) {
                        Object key = firebaseSessionsDependencies$getRegisteredSubscribers$1.d1;
                        InterfaceC4826Yn1 e = (InterfaceC4826Yn1) firebaseSessionsDependencies$getRegisteredSubscribers$1.b1;
                        SessionSubscriber.Name name = (SessionSubscriber.Name) firebaseSessionsDependencies$getRegisteredSubscribers$1.a1;
                        it = (Iterator) firebaseSessionsDependencies$getRegisteredSubscribers$1.Z0;
                        ?? r9 = (Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.Y0;
                        RT1.n(obj);
                        LinkedHashMap linkedHashMap2 = (Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.c1;
                        try {
                            SessionSubscriber d = a.d(name);
                            e.h(null);
                            linkedHashMap2.put(key, d);
                            linkedHashMap = r9;
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                key = entry.getKey();
                                name = (SessionSubscriber.Name) entry.getKey();
                                e = ((Dependency) entry.getValue()).e();
                                firebaseSessionsDependencies$getRegisteredSubscribers$1.Y0 = linkedHashMap;
                                firebaseSessionsDependencies$getRegisteredSubscribers$1.Z0 = it;
                                firebaseSessionsDependencies$getRegisteredSubscribers$1.a1 = name;
                                firebaseSessionsDependencies$getRegisteredSubscribers$1.b1 = e;
                                firebaseSessionsDependencies$getRegisteredSubscribers$1.c1 = linkedHashMap;
                                firebaseSessionsDependencies$getRegisteredSubscribers$1.d1 = key;
                                firebaseSessionsDependencies$getRegisteredSubscribers$1.g1 = 1;
                                if (e.e(null, firebaseSessionsDependencies$getRegisteredSubscribers$1) == l) {
                                    return l;
                                }
                                r9 = linkedHashMap;
                                linkedHashMap2 = linkedHashMap;
                                SessionSubscriber d2 = a.d(name);
                                e.h(null);
                                linkedHashMap2.put(key, d2);
                                linkedHashMap = r9;
                                if (it.hasNext()) {
                                    return linkedHashMap;
                                }
                            }
                        } catch (Throwable th) {
                            e.h(null);
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    Map<SessionSubscriber.Name, Dependency> map = c;
                    C6562gT0.o(map, "dependencies");
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(C8683p81.j(map.size()));
                    it = map.entrySet().iterator();
                    linkedHashMap = linkedHashMap3;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        firebaseSessionsDependencies$getRegisteredSubscribers$1 = new FirebaseSessionsDependencies$getRegisteredSubscribers$1(this, hm);
        Object obj2 = firebaseSessionsDependencies$getRegisteredSubscribers$1.e1;
        Object l2 = C7289jT0.l();
        i = firebaseSessionsDependencies$getRegisteredSubscribers$1.g1;
        if (i == 0) {
        }
    }

    @InterfaceC5056aJ2
    @NotNull
    public final SessionSubscriber d(@NotNull SessionSubscriber.Name name) {
        C6562gT0.p(name, "subscriberName");
        SessionSubscriber f = b(name).f();
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("Subscriber " + name + " has not been registered.");
    }

    @InterfaceC5056aJ2
    public final void f() {
        c.clear();
    }
}
