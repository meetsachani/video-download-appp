package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
class CycleDetector {

    /* loaded from: classes3.dex */
    public static class ComponentNode {
        public final Component<?> a;
        public final Set<ComponentNode> b = new HashSet();
        public final Set<ComponentNode> c = new HashSet();

        public ComponentNode(Component<?> component) {
            this.a = component;
        }

        public void a(ComponentNode componentNode) {
            this.b.add(componentNode);
        }

        public void b(ComponentNode componentNode) {
            this.c.add(componentNode);
        }

        public Component<?> c() {
            return this.a;
        }

        public Set<ComponentNode> d() {
            return this.b;
        }

        public boolean e() {
            return this.b.isEmpty();
        }

        public boolean f() {
            return this.c.isEmpty();
        }

        public void g(ComponentNode componentNode) {
            this.c.remove(componentNode);
        }
    }

    /* loaded from: classes3.dex */
    public static class Dep {
        public final Qualified<?> a;
        public final boolean b;

        public boolean equals(Object obj) {
            if (obj instanceof Dep) {
                Dep dep = (Dep) obj;
                if (dep.a.equals(this.a) && dep.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        public Dep(Qualified<?> qualified, boolean z) {
            this.a = qualified;
            this.b = z;
        }
    }

    public static void a(List<Component<?>> list) {
        Set<ComponentNode> c = c(list);
        Set<ComponentNode> b = b(c);
        int i = 0;
        while (!b.isEmpty()) {
            ComponentNode next = b.iterator().next();
            b.remove(next);
            i++;
            for (ComponentNode componentNode : next.d()) {
                componentNode.g(next);
                if (componentNode.f()) {
                    b.add(componentNode);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentNode componentNode2 : c) {
            if (!componentNode2.f() && !componentNode2.e()) {
                arrayList.add(componentNode2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    public static Set<ComponentNode> b(Set<ComponentNode> set) {
        HashSet hashSet = new HashSet();
        for (ComponentNode componentNode : set) {
            if (componentNode.f()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }

    public static Set<ComponentNode> c(List<Component<?>> list) {
        Set<ComponentNode> set;
        HashMap hashMap = new HashMap(list.size());
        for (Component<?> component : list) {
            ComponentNode componentNode = new ComponentNode(component);
            for (Qualified<? super Object> qualified : component.m()) {
                Dep dep = new Dep(qualified, !component.v());
                if (!hashMap.containsKey(dep)) {
                    hashMap.put(dep, new HashSet());
                }
                Set set2 = (Set) hashMap.get(dep);
                if (!set2.isEmpty() && !dep.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", qualified));
                }
                set2.add(componentNode);
            }
        }
        for (Set<ComponentNode> set3 : hashMap.values()) {
            for (ComponentNode componentNode2 : set3) {
                for (Dependency dependency : componentNode2.c().j()) {
                    if (dependency.f() && (set = (Set) hashMap.get(new Dep(dependency.d(), dependency.h()))) != null) {
                        for (ComponentNode componentNode3 : set) {
                            componentNode2.a(componentNode3);
                            componentNode3.b(componentNode2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
