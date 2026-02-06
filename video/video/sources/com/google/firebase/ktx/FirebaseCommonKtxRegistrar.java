package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import o.AbstractC7762lQ;
import o.C6562gT0;
import o.C8222nF;
import o.C8569og0;
import o.IR1;
import o.InterfaceC9150r20;
import org.jetbrains.annotations.NotNull;

@InterfaceC9150r20(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @IR1(expression = "", imports = {}))
@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        Component d = Component.f(Qualified.a(Background.class, AbstractC7762lQ.class)).b(Dependency.l(Qualified.a(Background.class, Executor.class))).f(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: b */
            public final AbstractC7762lQ a(ComponentContainer componentContainer) {
                Object g = componentContainer.g(Qualified.a(Background.class, Executor.class));
                C6562gT0.o(g, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C8569og0.c((Executor) g);
            }
        }).d();
        C6562gT0.o(d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component d2 = Component.f(Qualified.a(Lightweight.class, AbstractC7762lQ.class)).b(Dependency.l(Qualified.a(Lightweight.class, Executor.class))).f(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: b */
            public final AbstractC7762lQ a(ComponentContainer componentContainer) {
                Object g = componentContainer.g(Qualified.a(Lightweight.class, Executor.class));
                C6562gT0.o(g, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C8569og0.c((Executor) g);
            }
        }).d();
        C6562gT0.o(d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component d3 = Component.f(Qualified.a(Blocking.class, AbstractC7762lQ.class)).b(Dependency.l(Qualified.a(Blocking.class, Executor.class))).f(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: b */
            public final AbstractC7762lQ a(ComponentContainer componentContainer) {
                Object g = componentContainer.g(Qualified.a(Blocking.class, Executor.class));
                C6562gT0.o(g, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C8569og0.c((Executor) g);
            }
        }).d();
        C6562gT0.o(d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component d4 = Component.f(Qualified.a(UiThread.class, AbstractC7762lQ.class)).b(Dependency.l(Qualified.a(UiThread.class, Executor.class))).f(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: b */
            public final AbstractC7762lQ a(ComponentContainer componentContainer) {
                Object g = componentContainer.g(Qualified.a(UiThread.class, Executor.class));
                C6562gT0.o(g, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C8569og0.c((Executor) g);
            }
        }).d();
        C6562gT0.o(d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C8222nF.O(d, d2, d3, d4);
    }
}
