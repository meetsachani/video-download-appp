package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.SessionDatastoreImpl;
import o.AG1;
import o.AbstractC4225Si2;
import o.C2972Fn1;
import o.C7289jT0;
import o.C7458kA2;
import o.FV;
import o.HM;
import o.InterfaceC9974uQ;
import o.PU;
import o.RT1;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FV(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SessionDatastoreImpl$updateSessionId$1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
    public int Z0;
    public final /* synthetic */ SessionDatastoreImpl a1;
    public final /* synthetic */ String b1;

    @FV(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC4225Si2 implements VA0<C2972Fn1, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ String b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HM<? super AnonymousClass1> hm) {
            super(2, hm);
            this.b1 = str;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                ((C2972Fn1) this.a1).o(SessionDatastoreImpl.FirebaseSessionDataKeys.a.a(), this.b1);
                return C7458kA2.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        @Nullable
        /* renamed from: U */
        public final Object i(@NotNull C2972Fn1 c2972Fn1, @Nullable HM<? super C7458kA2> hm) {
            return ((AnonymousClass1) t(c2972Fn1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        @NotNull
        public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b1, hm);
            anonymousClass1.a1 = obj;
            return anonymousClass1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionDatastoreImpl$updateSessionId$1(SessionDatastoreImpl sessionDatastoreImpl, String str, HM<? super SessionDatastoreImpl$updateSessionId$1> hm) {
        super(2, hm);
        this.a1 = sessionDatastoreImpl;
        this.b1 = str;
    }

    @Override // o.AbstractC5644cl
    @Nullable
    public final Object F(@NotNull Object obj) {
        SessionDatastoreImpl.Companion companion;
        Context context;
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
            companion = SessionDatastoreImpl.f;
            context = this.a1.b;
            PU b = companion.b(context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b1, null);
            this.Z0 = 1;
            if (AG1.a(b, anonymousClass1, this) == l) {
                return l;
            }
        }
        return C7458kA2.a;
    }

    @Override // o.VA0
    @Nullable
    /* renamed from: U */
    public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
        return ((SessionDatastoreImpl$updateSessionId$1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        return new SessionDatastoreImpl$updateSessionId$1(this.a1, this.b1, hm);
    }
}
