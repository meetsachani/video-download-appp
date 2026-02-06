package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    public final String a;
    public final GlobalLibraryVersionRegistrar b;

    public DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.a = d(set);
        this.b = globalLibraryVersionRegistrar;
    }

    public static /* synthetic */ UserAgentPublisher b(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.h(LibraryVersion.class), GlobalLibraryVersionRegistrar.a());
    }

    public static Component<UserAgentPublisher> c() {
        return Component.h(UserAgentPublisher.class).b(Dependency.q(LibraryVersion.class)).f(new ComponentFactory() { // from class: o.w10
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                return DefaultUserAgentPublisher.b(componentContainer);
            }
        }).d();
    }

    public static String d(Set<LibraryVersion> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
