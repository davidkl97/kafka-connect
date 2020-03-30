=======
Install
=======

.. image:: https://img.shields.io/github/license/jcustenborder/kafka-connect.svg

.. image:: https://img.shields.io/github/release/jcustenborder/kafka-connect.svg
    :target: https://github.com/jcustenborder/kafka-connect/releases

.. image:: https://img.shields.io/maven-central/v/com.github.com.davidkl97.wapiti.kafka.connect/kafka-connect.svg
    :target: https://search.maven.org/#artifactdetails%7Ccom.github.com.davidkl97.wapiti.kafka.connect%7Ckafka-connect%7C1.0%7Cjar

^^^^^^^^^^^^^^^^
RPM Installation
^^^^^^^^^^^^^^^^

Before starting the RPM installation you must configure the :ref:`yum_repository` first.

.. code-block:: bash

    sudo yum install kafka-connect


^^^^^^^^^^^^^^^^
DEB Installation
^^^^^^^^^^^^^^^^

Before starting the RPM installation you must configure the :ref:`apt_repository` first.

.. code-block:: bash

    sudo apt-get install kafka-connect


^^^^^^^^^^^^^^^^^^
Maven Installation
^^^^^^^^^^^^^^^^^^

.. code-block:: xml

    <dependency>
        <groupId>com.github.com.davidkl97.wapiti.kafka.connect</groupId>
        <artifactId>kafka-connect</artifactId>
        <version>1.0</version>
    </dependency>


