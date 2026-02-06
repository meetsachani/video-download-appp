package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaap extends zaav {
    public final ArrayList<Api.Client> Y;
    public final /* synthetic */ zaaw Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaap(zaaw zaawVar, ArrayList<Api.Client> arrayList) {
        super(zaawVar, null);
        this.Z = zaawVar;
        this.Y = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    @InterfaceC10697xN2
    public final void a() {
        zabi zabiVar;
        IAccountAccessor iAccountAccessor;
        zabi zabiVar2;
        zaaw zaawVar = this.Z;
        zabiVar = zaawVar.a;
        zabiVar.i1.s = zaaw.y(zaawVar);
        ArrayList<Api.Client> arrayList = this.Y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zaaw zaawVar2 = this.Z;
            iAccountAccessor = zaawVar2.f192o;
            zabiVar2 = zaawVar2.a;
            arrayList.get(i).p(iAccountAccessor, zabiVar2.i1.s);
        }
    }
}
