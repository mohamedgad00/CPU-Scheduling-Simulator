# CPU Scheduling Simulator

A Java-based CPU Scheduling Simulator that allows users to simulate and analyze various CPU scheduling algorithms including :

   - First Come First Serve (FCFS)
   - Shortest Job First (SJF)
   - Priority Scheduling
   - Round Robin (RR)

## 🧠 Features

- Simulate multiple CPU scheduling algorithms
- Input custom process data: process ID, arrival time, burst time, and priority
- Choose your preferred algorithm for scheduling
- Visualize results: waiting time, turnaround time, and average metrics
- GUI-based interface (if applicable) or console interaction
- Accurate simulation of time-sharing (Round Robin) using a user-defined time quantum

## 📋 Algorithms Overview

### 1. FCFS (First Come First Serve)
- Non-preemptive
- Processes are executed in the order they arrive

### 2. SJF (Shortest Job First)
- Can be preemptive or non-preemptive (you can mention which version is implemented)
- Processes with the shortest burst time are executed first

### 3. Priority Scheduling
- Can be preemptive or non-preemptive (specify which version you implemented)
- Processes are scheduled based on priority (lower number = higher priority)

### 4. Round Robin
- Preemptive
- Each process gets a fixed time slice (quantum) and cycles through the ready queue

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or a simple text editor and terminal

### Running the Project

1. *Clone the repository :*
   ```bash
   git clone https://github.com/yourusername/cpu-scheduling-simulator.git
   cd cpu-scheduling-simulator
   ```
2. *Compile the Java files :*
  ```bash
     javac *.java
  ```
3. *Run the simulator :*
  ```
     java Main
  ```

