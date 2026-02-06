package com.google.firebase;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import o.AbstractC7762lQ;
import o.C6562gT0;
import o.C8569og0;
import o.C9998uW1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class FirebaseKt {
    @NotNull
    public static final FirebaseApp a(@NotNull Firebase firebase, @NotNull String str) {
        C6562gT0.p(firebase, "<this>");
        C6562gT0.p(str, "name");
        FirebaseApp q = FirebaseApp.q(str);
        C6562gT0.o(q, "getInstance(name)");
        return q;
    }

    public static final /* synthetic */ <T extends Annotation> Component<AbstractC7762lQ> b() {
        C6562gT0.y(4, "T");
        Component.Builder f = Component.f(Qualified.a(Annotation.class, AbstractC7762lQ.class));
        C6562gT0.y(4, "T");
        Component.Builder b = f.b(Dependency.l(Qualified.a(Annotation.class, Executor.class)));
        C6562gT0.w();
        Component<AbstractC7762lQ> d = b.f(new ComponentFactory() { // from class: com.google.firebase.FirebaseKt$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: b */
            public final AbstractC7762lQ a(ComponentContainer componentContainer) {
                C6562gT0.y(4, "T");
                Object g = componentContainer.g(Qualified.a(Annotation.class, Executor.class));
                C6562gT0.o(g, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C8569og0.c((Executor) g);
            }
        }).d();
        C6562gT0.o(d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return d;
    }

    @NotNull
    public static final FirebaseApp c(@NotNull Firebase firebase) {
        C6562gT0.p(firebase, "<this>");
        FirebaseApp p = FirebaseApp.p();
        C6562gT0.o(p, "getInstance()");
        return p;
    }

    @NotNull
    public static final FirebaseOptions d(@NotNull Firebase firebase) {
        C6562gT0.p(firebase, "<this>");
        FirebaseOptions s = c(Firebase.a).s();
        C6562gT0.o(s, "Firebase.app.options");
        return s;
    }

    @Nullable
    public static final FirebaseApp e(@NotNull Firebase firebase, @NotNull Context context) {
        C6562gT0.p(firebase, "<this>");
        C6562gT0.p(context, "context");
        return FirebaseApp.x(context);
    }

    @NotNull
    public static final FirebaseApp f(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions) {
        C6562gT0.p(firebase, "<this>");
        C6562gT0.p(context, "context");
        C6562gT0.p(firebaseOptions, C9998uW1.m0);
        FirebaseApp y = FirebaseApp.y(context, firebaseOptions);
        C6562gT0.o(y, "initializeApp(context, options)");
        return y;
    }

    @NotNull
    public static final FirebaseApp g(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions, @NotNull String str) {
        C6562gT0.p(firebase, "<this>");
        C6562gT0.p(context, "context");
        C6562gT0.p(firebaseOptions, C9998uW1.m0);
        C6562gT0.p(str, "name");
        FirebaseApp z = FirebaseApp.z(context, firebaseOptions, str);
        C6562gT0.o(z, "initializeApp(context, options, name)");
        return z;
    }
}
