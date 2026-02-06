package com.google.firebase.remoteconfig;

import o.AI1;
import o.AbstractC4225Si2;
import o.AbstractC8052mY0;
import o.C10919yI1;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.FA0;
import o.FV;
import o.HM;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class RemoteConfigKt$configUpdates$1 extends AbstractC4225Si2 implements VA0<AI1<? super ConfigUpdate>, HM<? super C7458kA2>, Object> {
    public int Z0;
    public /* synthetic */ Object a1;
    public final /* synthetic */ FirebaseRemoteConfig b1;

    /* renamed from: com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC8052mY0 implements FA0<C7458kA2> {
        public final /* synthetic */ ConfigUpdateListenerRegistration X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
            super(0);
            this.X = configUpdateListenerRegistration;
        }

        public final void c() {
            this.X.remove();
        }

        @Override // o.FA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke() {
            c();
            return C7458kA2.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, HM<? super RemoteConfigKt$configUpdates$1> hm) {
        super(2, hm);
        this.b1 = firebaseRemoteConfig;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        Object l = C7289jT0.l();
        int i = this.Z0;
        if (i != 0) {
            if (i == 1) {
                RT1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            RT1.n(obj);
            AI1 ai1 = (AI1) this.a1;
            FirebaseRemoteConfig firebaseRemoteConfig = this.b1;
            ConfigUpdateListenerRegistration k = firebaseRemoteConfig.k(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, ai1));
            C6562gT0.o(k, "FirebaseRemoteConfig.con…      }\n        }\n      )");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(k);
            this.Z0 = 1;
            if (C10919yI1.b(ai1, anonymousClass1, this) == l) {
                return l;
            }
        }
        return C7458kA2.a;
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull AI1<? super ConfigUpdate> ai1, @Nullable HM<? super C7458kA2> hm) {
        return ((RemoteConfigKt$configUpdates$1) t(ai1, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.b1, hm);
        remoteConfigKt$configUpdates$1.a1 = obj;
        return remoteConfigKt$configUpdates$1;
    }
}
