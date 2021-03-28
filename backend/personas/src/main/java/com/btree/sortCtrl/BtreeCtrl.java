package com.btree.sortCtrl;

import java.util.ArrayList;
import java.util.List;

import com.btree.model.Persona;
import com.btree.sortModel.Node;

public class BtreeCtrl {

	Node root;
	private List<Node> tree = new ArrayList<>();

	// Metodo donde se carga el arbol de la base de datos, organiza la data en caso
	// de que llegue desordenada en la base de datos.

	public void dataTree(List<Persona> data) {
		System.out.println("Entro al arbol de datos");

		for (int indice = 0; indice < data.size(); indice++) {

			Persona leaf = data.get(indice);

			addNode(leaf.getId(), leaf.getName());
		}

		printTree();

	}

	// Imprimir arbol ordenado.
	public void printTree() {

		List<Node> data = this.tree;
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));

		}
	}

	// Añade la hoja al extremo izquierdo del arbol
	public void leftLeaf(Node node) {

		tree.add(0, node);
	}

	// Añade la hoja al extremo derecha del arbol
	public void rightLeaf(Node node) {

		tree.add(node); 
	}

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (root == null) {

			root = newNode;
			tree.add(root);

		} else {

			Node focusNode = root;

			Node parent;

			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {

					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						leftLeaf(newNode);
						return;

					}

				} else {

					focusNode = focusNode.rightChild;

					if (focusNode == null) {

						parent.rightChild = newNode;
						rightLeaf(newNode);
						return;

					}
				}
			}
		}
	}
}
