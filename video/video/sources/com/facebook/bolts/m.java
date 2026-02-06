package com.facebook.bolts;

import o.C6562gT0;
import o.W12;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class m extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Exception exc) {
        super("An exception was thrown by an Executor", exc);
        C6562gT0.p(exc, W12.i);
    }
}
