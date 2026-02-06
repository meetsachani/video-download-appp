package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class zzf implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int a = iVersions.a(context, str, true);
        selectionResult.b = a;
        if (a != 0) {
            selectionResult.c = 1;
            return selectionResult;
        }
        int b = iVersions.b(context, str);
        selectionResult.a = b;
        if (b != 0) {
            selectionResult.c = -1;
        }
        return selectionResult;
    }
}
