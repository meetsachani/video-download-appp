package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.a = iVersions.b(context, str);
        int i = 1;
        int a = iVersions.a(context, str, true);
        selectionResult.b = a;
        int i2 = selectionResult.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                selectionResult.c = i;
                return selectionResult;
            }
        }
        if (a < i2) {
            i = -1;
        }
        selectionResult.c = i;
        return selectionResult;
    }
}
