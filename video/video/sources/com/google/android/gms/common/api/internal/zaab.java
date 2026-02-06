package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaab implements PendingResult.StatusListener {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ zaad b;

    public zaab(zaad zaadVar, BasePendingResult basePendingResult) {
        this.b = zaadVar;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        Map map;
        map = this.b.a;
        map.remove(this.a);
    }
}
