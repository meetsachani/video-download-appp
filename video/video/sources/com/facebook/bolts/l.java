package com.facebook.bolts;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface l<TTaskResult, TContinuationResult> {
    @Nullable
    TContinuationResult a(@NotNull B<TTaskResult> b) throws Exception;
}
