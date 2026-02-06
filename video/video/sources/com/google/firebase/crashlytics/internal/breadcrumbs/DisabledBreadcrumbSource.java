package com.google.firebase.crashlytics.internal.breadcrumbs;

import com.google.firebase.crashlytics.internal.Logger;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class DisabledBreadcrumbSource implements BreadcrumbSource {
    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(@InterfaceC11300zs1 BreadcrumbHandler breadcrumbHandler) {
        Logger.f().b("Could not register handler for breadcrumbs events.");
    }
}
